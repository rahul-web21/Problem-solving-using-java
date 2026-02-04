import java.time.LocalDate;

public class FindDay {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day)
                        .getDayOfWeek()
                        .toString();
    }
}