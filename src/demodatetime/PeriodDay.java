package demodatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDay {
    static void main() {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1967, Month.OCTOBER, 26);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        IO.println("Siz " + p.getYears() + " yowu, " + p.getMonths() +
                " oy va " + p.getDays() +
                " kunliksiz. (Jami " + p2 + " kun)");
    }
}
