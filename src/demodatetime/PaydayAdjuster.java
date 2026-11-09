package demodatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class PaydayAdjuster implements TemporalAdjuster {
    /**
     * adjustInto method Temporal'ni instance'ini qabul qiladi va adjusted LocalDate'ni qaytaradi.
     * Agar uzatilgan parameter'da LocalDate bo'lmasa, DateTimeException otadi.
     */
    public Temporal adjustInto(Temporal input) {
        LocalDate date = LocalDate.from(input);
        int day;
        if (date.getDayOfMonth() < 15) {
            day = 15;
        } else {
            day = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        }
        date = date.withDayOfMonth(day);
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            date = date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        }

        return input.with(date);
    }

    static void main() {

        // yyyy MMM d format oylar text waklida print qiliw ucun (Masalan: 2013 Jun 3)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMM d", Locale.US);

        LocalDate date1 = LocalDate.of(2013, 6, 3);
        LocalDate nextPayday1 = date1.with(new PaydayAdjuster());

        IO.println("Berilgan sana:     " + date1.format(formatter));
        IO.println("Keyingi oylik kuni: " + nextPayday1.format(formatter));
        IO.println(); // bo'w line

        LocalDate date2 = LocalDate.of(2013, 6, 18);
        LocalDate nextPayday2 = date2.with(new PaydayAdjuster());

        IO.println("Berilgan sana:     " + date2.format(formatter));
        IO.println("Keyingi oylik kuni: " + nextPayday2.format(formatter));
    }
}

