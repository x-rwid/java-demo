package demodatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateNonISO {

    /**
     * Chronology va US-en Locale'ga asoslangan SHORT naqw ila
     * DateTimeFormatter yordamida LocalDate (ISO)ni String'ga convert'laydi.
     *
     * @param localDate - convert'law va format'law ucun ISO sana.
     * @param chrono    - ixtiyariy Chronology. Agar null bo'lsa, IsoChronology qo'llaniladi.
     */

    public static String toString(LocalDate localDate, Chronology chrono) {
        if (localDate != null) {
            Locale locale = Locale.of("en", "US");
            if (chrono == null) {
                chrono = IsoChronology.INSTANCE;
            }
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                            .withLocale(locale)
                            .withChronology(chrono)
                            .withDecimalStyle(DecimalStyle.of(locale));
            return dateFormatter.format(localDate);
        } else {
            return "";
        }
    }

    static void main() {
        LocalDate date = LocalDate.of(2027, Month.JANUARY, 29);

        System.out.printf("%s%n",
                toString(date, JapaneseChronology.INSTANCE));
        System.out.printf("%s%n",
                toString(date, MinguoChronology.INSTANCE));
        System.out.printf("%s%n",
                toString(date, ThaiBuddhistChronology.INSTANCE));
        System.out.printf("%s%n",
                toString(date, HijrahChronology.INSTANCE));
    }
}

