package demodatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodBDay {
    static void main() {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1967, Month.OCTOBER, 26);

        LocalDate nextBDay = birthday.withYear(today.getYear());

        // agar tavallad kun BU yil allaqacon bo'lgan bo'lsa,yilga 1 qo'wiw
        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }

        Period p = Period.between(today, nextBDay);
        long p2 = ChronoUnit.DAYS.between(today, nextBDay);
        IO.println("Keyingi tavallud kunga " + p.getMonths() + " oyu " +
                p.getDays() + " kun qoldi. (Jami " +
                p2 + " kun)");
    }
}
