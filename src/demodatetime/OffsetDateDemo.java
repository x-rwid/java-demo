package demodatetime;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class OffsetDateDemo {
    static void main() {

        // July 2013 dagi oxirgi Paywanbani topiw
        LocalDateTime localDate = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
        ZoneOffset offset = ZoneOffset.of("-08:00");

        OffsetDateTime offsetDate = OffsetDateTime.of(localDate, offset);
        OffsetDateTime lastThursday =
                offsetDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
        System.out.printf("July 2013 sanadagi oxirgi Paywanba %s ci sana.%n",
                lastThursday.getDayOfMonth());
    }
}
