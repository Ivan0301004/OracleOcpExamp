package CoreAPI.DatesAndTimes;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Durations {
    public static void main(String[] args) {
        var daily           = Duration.ofDays(1);
        var hourly          = Duration.ofHours(2);
        var everyMinute     = Duration.ofMinutes(10);
        var everyTenSeconds = Duration.ofSeconds(10);
        var everyMills      = Duration.ofMillis(1);
        var everyNanos      = Duration.ofNanos(1);

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMills);
        System.out.println(everyNanos + " \n\n");

        daily = Duration.of(1, ChronoUnit.DAYS);
        hourly = Duration.of(2, ChronoUnit.HOURS);
        everyMinute = Duration.of(10, ChronoUnit.MINUTES);
        everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        everyMills = Duration.of(1, ChronoUnit.MILLIS);
        everyNanos = Duration.of(1, ChronoUnit.NANOS);

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMills);
        System.out.println(everyNanos + " \n\n");


        // Chrono unit for differences

        var one  = LocalTime.of(5, 15);
        var two  = LocalTime.of(6, 30);
        var date = LocalTime.of(12, 23, 34);

        System.out.println("Hours   : " + ChronoUnit.HOURS.between(one, two));
        System.out.println("Minutes : " + ChronoUnit.MINUTES.between(one, two));
        System.out.println("Minutes :" + ChronoUnit.MINUTES.between(one, date));


        LocalTime time = LocalTime.of(3, 12, 45);
        System.out.println(time); // 03:12:45
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated); // 03:12
    }
}
