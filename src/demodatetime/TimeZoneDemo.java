package demodatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class TimeZoneDemo {
    static void main() {

        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime dt = LocalDateTime.now();

        // zone set'idan foydalanib, List tuziw va uni sort'law
        List<String> zoneList = new ArrayList<>(allZones);
        zoneList.sort(Comparator.naturalOrder());

        for (String zone : zoneList) {
            ZoneId zoneId = ZoneId.of(zone);
            ZonedDateTime zdt = dt.atZone(zoneId);
            ZoneOffset offset = zdt.getOffset();
            int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
            String out = String.format("%35s %10s", zone, offset);
            // faqat butun soatlik offset'ga ega bo'lmagan time zone'larni standard out'ga yoziw
            if (secondsOfHour != 0) {
                IO.println(out);
            }
        }
    }
}
