package demodatetime;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class LeapYearDemo {
    static void main() {

        // 2027 yil ucun 29 Fev yaroqli ekanini aniqlawda isValidYear() method'dan foydalaniw
        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear1 = date.isValidYear(2027);
        IO.println("2027 yil Kabisa yilimi?: " + validLeapYear1);

        // berilgan yilni Kabisa yili ekanini aniqlaw ucun isLeap() method'dan foydalaniw
        boolean validLeapYear2 = Year.of(2028).isLeap();
        IO.println("2028 yil Kabisa yilimi? "+ validLeapYear2);
    }
}
