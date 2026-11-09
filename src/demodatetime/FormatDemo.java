package demodatetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDemo {
    static void main() {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");

        // July 20, 2013, 7:30 p.m. da San Francisco'dan jo'naw
        LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
        ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

        try {
            String out1 = departure.format(format);
            System.out.printf("JO'NAW:  %s (%s)%n", out1, leavingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s format'lab bo'lmadi!%n", departure);
            throw exc;
        }

        // parvoz 10 soatu 50 daqiqa yoki 650 daqiqa
        ZoneId arrivingZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone)
                .plusMinutes(650);

        try {
            String out2 = arrival.format(format);
            System.out.printf("KELIW: %s (%s)%n", out2, arrivingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s format'lab bo'lmadi!%n", arrival);
            throw exc;
        }

        if (arrivingZone.getRules().isDaylightSavings(arrival.toInstant()))
            System.out.printf("  (%s yozgi vaqt amal qiladi.)%n",
                    arrivingZone);
        else
            System.out.printf("  (%s standard vaqt amal qiladi.)%n",
                    arrivingZone);
    }
}
