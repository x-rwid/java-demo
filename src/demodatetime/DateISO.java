package demodatetime;

import java.time.LocalDate;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateISO {

    /**
     * US-en Locale va taqdim etilgan Chronology'ga asoslangan short naqw ila
     * DateTimeFormatter yordamida String'ni tahlillaydi,
     * keyin uni LocalDate (ISO) qiymatiga convert'laydi.
     *
     * @param text   - Chronology va joriy Locale ucun kutilgan SHORT format'dagi input sana text'i.
     * @param chrono - ixtiyariy Chronology. Agar null bo'lsa, IsoChronology qo'llaniladi.
     */

    public static LocalDate fromString(String text, Chronology chrono) {
        if (text != null && !text.isEmpty()) {
            Locale locale = Locale.of("en", "US");
            if (chrono == null) {
                chrono = IsoChronology.INSTANCE;
            }
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                            .withLocale(locale)
                            .withChronology(chrono)
                            .withDecimalStyle(DecimalStyle.of(locale));
            return LocalDate.parse(text, dateFormatter);
        }
        return null;
    }

    static void main() {

        System.out.printf("%s%n", fromString("10/29/0008 H",
                JapaneseChronology.INSTANCE));
        System.out.printf("%s%n", fromString("10/29/0085 Minguo",
                MinguoChronology.INSTANCE));
        System.out.printf("%s%n", fromString("10/29/2539 BE",
                ThaiBuddhistChronology.INSTANCE));
        System.out.printf("%s%n", fromString("6/16/1417 AH",
                HijrahChronology.INSTANCE));
    }
}
