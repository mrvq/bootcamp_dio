public class App {
    public static void main(String[] args) throws Exception {

        Manager manager = new Manager();

        manager.setName("Joao");
        manager.setLogin("joao");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

    }
}
