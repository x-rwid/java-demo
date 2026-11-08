package demodatetime;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDemo {
    static void main() {

        Month month = Month.APRIL;
        Locale locale = Locale.getDefault();
        IO.println(month.getDisplayName(TextStyle.FULL, locale));
        IO.println(month.getDisplayName(TextStyle.NARROW, locale));
        IO.println(month.getDisplayName(TextStyle.SHORT, locale));
    }
}
