import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) throws Exception {

        // scanner.useDelimiter("\\n"); // Set the scanner to use newline as the
        // delimiter
        // System.out.println("===Bem vindo a PetMachine===");

        var option = -1;

        do {
            System.out.println("===Escolha uma opção===");
            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Adicionar água na máquina");
            System.out.println("3 - Adicionar shampoo na máquina ");
            System.out.println("4 - Verificar água na máquina");
            System.out.println("5 - Verificar shampoo na máquina");
            System.out.println("6 - Verificar se tem pet no banho ");
            System.out.println("7 - Adicionar Pet na máquina");
            System.out.println("8 - Remover Pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt(); // Consume the newline character

            switch (option) {

                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.cleanMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");

            }
        } while (true);

    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "A máquina tem um pet!" : "A máquina não tem um pet!");
    }

    private static void setWater() {
        System.out.println("Coloque a quantidade de agua que deseja adicionar:");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Coloque a quantidade de shampoo que deseja adicionar:");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina está no momento com " + amount + " litro(s) de agua.");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A maquina está no momento com " + amount + " litro(s) de shampoo.");
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Coloque o nome do pet:");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O Pet " + pet.getName() + " foi colocado na maquina!");
    }

}
