package Practice;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class PersonComparator {
	private String name;
    private int age;

    public static void main(String[] args) {
        // Comparator to compare persons based on their age
        Comparator<PersonComparator> byAge = Comparator.comparingInt(PersonComparator::getAge);

        // List of Person objects
        List<PersonComparator> people = Arrays.asList(
                new PersonComparator("John", 25),
                new PersonComparator("Alice", 30),
                new PersonComparator("Bob", 22)
        );

        // Sorting the list using the Comparator
        people.sort(byAge);

        // After sorting, the list will be in ascending order by age
        for (PersonComparator person : people) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
    }
    public PersonComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
