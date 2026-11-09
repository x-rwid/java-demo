package demodatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class PreDefAdjuster {
    static void main() {

        LocalDate date = LocalDate.of(2000, Month.OCTOBER, 15);
        DayOfWeek dotw = date.getDayOfWeek();
        System.out.printf("%s %s%n", date, dotw);

        System.out.printf("Oyni birinci kuni: %s%n",
                date.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.printf("Oyni birinci Duwanbasi: %s%n",
                date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
        System.out.printf("Oyni oxirgi kuni: %s%n",
                date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.printf("Keyingi oyni birinci kuni: %s%n",
                date.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.printf("Keyingi yilni birinci kuni: %s%n",
                date.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.printf("Yilni birinci kuni: %s%n",
                date.with(TemporalAdjusters.firstDayOfYear()));
    }
}
