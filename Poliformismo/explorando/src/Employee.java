public class Employee {

    protected double salary;
    protected String code;
    protected String name;
    protected String address;
    protected String age;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Employee(double salary, String code, String name, String address, String age) {
        this.salary = salary;
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Employee() {
        this.salary = 0;
        this.code = null;
        this.name = null;
        this.address = null;
        this.age = null;
    }

}
