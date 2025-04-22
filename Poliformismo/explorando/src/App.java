public class App {
    public static void main(String[] args) throws Exception {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        System.out.printf("==========%s==========\n", employee.getClass().getCanonicalName());

        switch (employee) {
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("Joao");
                manager.setSalary(1000.0);
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setComission(1200.0);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
                System.out.println(manager.getFullSalary(500.0));

            }
            case Salesman salesman -> {
                salesman.setCode("321");
                salesman.setName("Lucas");
                salesman.setSalary(2800.0);
                salesman.setPercentPerSold(1200.0);
                salesman.setSoldAmount(1000.0);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
            default -> {
                System.out.println("Unknown employee type");
            }
        }

        System.out.println(employee.getFullSalary());
        System.out.printf("====================\n");

    }
}
