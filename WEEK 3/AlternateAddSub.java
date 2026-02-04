import java.util.*;
import java.util.stream.*;

public class CollectorsExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David");

        // toList()
        List<String> list = names.stream().collect(Collectors.toList());

        // toSet()
        Set<String> set = names.stream().collect(Collectors.toSet());

        // groupingBy()
        Map<String, Long> map = names.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // joining()
        String joined = names.stream().collect(Collectors.joining(", "));

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Grouped Count: " + map);
        System.out.println("Joined: " + joined);
    }
}