package br.com.dio;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.dio.model.Board;
import br.com.dio.model.Space;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {

        final var positions = Stream.of(args)
                .collect(Collectors.toMap(
                        k -> k.split(":")[0],
                        v -> v.split(":")[1]));
        var option = -1;

        while (true) {
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1 - Iniciar novo Jogo");
            System.out.println("2 - Colocar um novo numero");
            System.out.println("3 - Remover um numero");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar o status do jogo");
            System.out.println("6 - Limpar o jogo");
            System.out.println("7 - Finalizar o jogo");
            System.out.println("8 - Sair: ");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida, selecione uma opções do menu.");
            }
        }

    }

    private static void startGame(final Map<String, String> positions) {
        if (nonNull(board)) {
            System.out.println("Um jogo já está em andamento, finalize-o antes de iniciar um novo.");
            return;
        }
        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                var positionConfig = positions.get("%s:%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);

            }
        }
        board = new Board(spaces);
        System.out.println("Jogo esta pronto para começar!");
    }

    private static void inputNumber() {
        if (isNull(board)) {
            System.out.println("Nenhum jogo iniciado, inicie um novo jogo.");
            return;
        }

        System.out.println("Informe a coluna em que o numero será inserido");
        var col = runUntilValidNumber(0, 8);

        System.out.println("Informe a coluna em que o numero será inserido");
        var row = runUntilValidNumber(0, 8);

        System.out.printf("Informe o numero que vai entrar na posição [%s, %s]\n", col, row);
        var value = runUntilValidNumber(1, 9);
        if (!board.changeValues(col, row, value)) {
            System.out.printf("A posição [%s,%s] tem um valor fixo\n!", col, row);
        } else {
            System.out.println("Não foi possível inserir o valor, tente novamente.");
        }
    }

    private static void finishGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finishGame'");
    }

    private static void clearGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearGame'");
    }

    private static void showGameStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showGameStatus'");
    }

    private static void showCurrentGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showCurrentGame'");
    }

    private static void removeNumber() {
        if (isNull(board)) {
            System.out.println("Nenhum jogo iniciado, inicie um novo jogo.");
            return;
        }

        System.out.println("Informe a coluna em que o numero será removido");
        var col = runUntilValidNumber(0, 8);

        System.out.println("Informe a coluna em que o numero será removido");
        var row = runUntilValidNumber(0, 8);

        if (!board.clearValue(col, row)) {
            System.out.printf("A posição [%s,%s] tem um valor fixo\n!", col, row);
        } else {
            System.out.println("Não foi possível remover o valor, tente novamente.");
        }
    }

    private static int runUntilValidNumber(final int min, final int max) {
        var current = scanner.nextInt();
        while (current < min || current > max) {
            System.out.printf("Informe um numero entre %s e %s\n.", min, max);
            current = scanner.nextInt();

        }
        return current;
    }

}
