package demodatetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantDemo {
    static void main() {

        Instant timestamp =  Instant.now();

        LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());

        System.out.printf("%s %d %d %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
                ldt.getYear(), ldt.getHour(), ldt.getMinute());
    }
}
