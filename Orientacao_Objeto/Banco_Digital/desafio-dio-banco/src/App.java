public class App {
    public static void main(String[] args) throws Exception {

        Conta cc = new ContaCorrrente();
        Conta poupanca = new ContaCorrrente();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
