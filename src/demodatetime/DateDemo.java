package demodatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateDemo {
    static void main() {

        LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate nextWed = date.with(adj);
        System.out.printf("%s sanasi ucun keyingi Corwanba %s.%n", date, nextWed);
    }
}
