package demodatetime;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class DateYearMonth {
    static void main() {

        YearMonth date = YearMonth.now();
        System.out.printf("%s: %d%n", date, date.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());

        boolean validLeapYear = Year.of(2028).isLeap();
        IO.println("2028 yil Kabisa yilimi? "+ validLeapYear);
    }
}
