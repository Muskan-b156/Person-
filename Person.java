
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate dob;

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge());
    }

    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    public static void main(String[] args) {
        Person P = new Person("Muskan", LocalDate.of(2000, 5, 15));
        P.displayDetails();
    }
}



