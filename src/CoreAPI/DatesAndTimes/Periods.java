package CoreAPI.DatesAndTimes;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Periods {
    public static void main(String[] args) {
        var start  = LocalDate.of(2023, Month.APRIL, 1);
        var end    = LocalDate.of(2023, Month.MAY, 5);
        var period = Period.ofMonths(1);
        performedAnimalEnrichment(start, end, period);
        System.out.println();

        System.out.println(Period.ofMonths(2));

    }

    private static void performedAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("Give new toy : " + upTo);
            upTo = upTo.plus(period);
        }
    }


    static void createPeriods() {
        var annually         = Period.ofYears(2);
        var quarterly        = Period.ofMonths(3);
        var everyThreeWeeks  = Period.ofWeeks(3);
        var everyOtherDay    = Period.ofDays(2);
        var everyYearAndWeek = Period.of(1, 0, 7);
    }
}
