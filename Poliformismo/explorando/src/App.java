public class App {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee();
        Employee salesman = new Salesman();
        Manager manager = new Manager();

        System.out.println(employee instanceof Employee); // true
        System.out.println(manager instanceof Employee); // false
    }
}
