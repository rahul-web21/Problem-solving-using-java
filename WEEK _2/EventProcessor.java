import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}

public class EventProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Event> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new Event(sc.next(), sc.next()));
        }

        int month = sc.nextInt();

        List<Event> sorted = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

        sorted.forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();

        System.out.println(sorted.get(0).getName());
        System.out.println(sorted.get(sorted.size() - 1).getName());

        sorted.stream()
              .filter(e -> e.getDate().getMonthValue() == month)
              .forEach(e -> System.out.print(e.getName() + " "));
    }
}