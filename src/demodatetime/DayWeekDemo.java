package demodatetime;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayWeekDemo {
    static void main() {

        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        IO.println(dow.getDisplayName(TextStyle.FULL, locale));
        IO.println(dow.getDisplayName(TextStyle.NARROW, locale));
        IO.println(dow.getDisplayName(TextStyle.SHORT, locale));
    }
}
