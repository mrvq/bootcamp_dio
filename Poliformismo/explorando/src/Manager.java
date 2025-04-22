public non-sealed class Manager extends Employee {

    public Manager(double salary, String code, String name, String address, String age, String login,
            String password, double comission) {
        super(salary, code, name, address, age);

        this.login = login;
        this.password = password;
        this.comission = comission;

    }

    private String login;
    private String password;
    private double comission;

    @Override
    public String getCode() {

        return "MN" + super.getCode();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public Manager() {
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.comission;
    }

    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }
}
