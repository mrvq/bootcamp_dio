public class App {
    public static void main(String[] args) throws Exception {

        var male = new Person("Jao");

        var female = new Person("Maria");

        System.out.println();
        System.out.println("Male name : " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name : " + female.getName() + " age: " + female.getAge());

    }
}
