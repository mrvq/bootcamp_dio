import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int option;
        GeometricForm geometricForm = null;
        while (true) {
            System.out.println("Escolha a forma geometrica para calcular a area ()");

            System.out.println("1 - Quadrado");

            System.out.println("2 - Retangulo");

            System.out.println("3 - Circulo");

            System.out.println("4 - Sair do programa");
            option = scanner.nextInt();

            if (option == 1) {
                geometricForm = createSquare();

            } else if (option == 2) {
                geometricForm = createRetangle();

            } else if (option == 3) {
                geometricForm = createCircle();
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Opção invalida");
            }
            System.out.println("O resultado do calculo de área é " + geometricForm.getArea());

        }

    }

    private static GeometricForm createSquare() {

        System.out.println("Informe o tamanho dos lados:");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRetangle() {

        System.out.println("Informe a base:");
        var base = scanner.nextDouble();

        System.out.println("Informe a altura:");
        var height = scanner.nextDouble();

        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {

        System.out.println("Informe o Raio:");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
