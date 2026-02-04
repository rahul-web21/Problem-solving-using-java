import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static boolean isOlderThan(Person p, int limit) {
        return p.age > limit;
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Person(sc.next(), sc.nextInt()));
        }

        int ageLimit = sc.nextInt();

        list.stream()
            .map(Person::getName)
            .sorted()
            .forEach(System.out::println);

        list.stream()
            .filter(p -> Person.isOlderThan(p, ageLimit))
            .forEach(p -> System.out.println(p.name));
    }
}