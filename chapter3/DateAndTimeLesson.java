package chapter3;
import java.time.*;

public class DateAndTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date2);
        LocalTime time1 = LocalTime.of(6, 15); // hour and

        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // +
        LocalDateTime dateTime1 = LocalDateTime.of(2015,Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);


        //LocalDate plus, minus - Days,Weeks,Months,Years
        System.out.println(date1.minusDays(10));
        System.out.println(date1.plusWeeks(2));
        System.out.println(date1);
        date1 = LocalDate.of(date1.plusWeeks(2).getYear(),date1.plusWeeks(2).getMonth(),date1.plusWeeks(2).getDayOfMonth());
        System.out.println(date1);
        //LocalTime plus,minus - Hours,Minutes,Seconds,Nanos
        System.out.println(time1.plusHours(2));
        // time1 = LocalTime.of(time1.plusHours(2).getHour(),time1.plusHours(2).getMinute());
        // LocalDateTime plus,minus - Days,Weeks,Months,Years, Hours,Minutes,Seconds,Nanos
        System.out.println(dateTime1.plusDays(1).plusHours(2).minusYears(1).minusDays(3));
    }
}
