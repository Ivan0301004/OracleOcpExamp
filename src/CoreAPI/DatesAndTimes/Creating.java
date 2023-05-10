package CoreAPI.DatesAndTimes;

import java.time.*;

public class Creating {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());


        // Creating date without time
        var date1 = LocalDate.of(2023, Month.APRIL, 24);
        var date2 = LocalDate.of(2024, 1, 13);

        System.out.println("Date one : " + date1);
        System.out.println("Date two : " + date2);


        // Creating only the time
        var time1 = LocalTime.of(6, 14);
        var time2 = LocalTime.of(14, 56, 30);
        var time3 = LocalTime.of(13, 45, 56, 230);

        System.out.println("Time 1 : " + time1);
        System.out.println("Time 2 : " + time2);
        System.out.println("Time 3 : " + time3);

        // Dates and time into one object
        var dateTime1 = LocalDateTime.of(2023, Month.JANUARY, 13, 21, 39);
        var dateTime2 = LocalDateTime.of(2023, Month.JANUARY, 13, 21, 49, 34);
        var dateTime3 = LocalDateTime.of(2023, Month.JANUARY, 13, 21, 29, 56, 700);
        var dateTime4 = LocalDateTime.of(date1, time3);

        System.out.println("Date Time 1 : " + dateTime1);
        System.out.println("Date Time 2 : " + dateTime2);
        System.out.println("Date Time 3 : " + dateTime3);
        System.out.println("Date Time 4 : " + dateTime4);


        var zone = ZoneId.of("America/Mexico_City");
        var zone1 = ZonedDateTime.of(date1, time1, zone);
        var zone3 = ZonedDateTime.of(dateTime1, zone);

        System.out.println("\n\nZone 1 : " + zone);
        System.out.println("Zone 2 : " + zone1);
        System.out.println("Zone 3 : " + zone3);

    }
}
