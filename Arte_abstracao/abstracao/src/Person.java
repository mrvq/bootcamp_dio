import java.time.OffsetDateTime;

public class Person {

    public static String teste() {
        return "teste";
    }

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 1;

    }

    public void incAge() {
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) {
            return;
        }
        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

}
