package demodatetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {
    static void main() {

        System.out.printf("hozir: %s%n", LocalDateTime.now());

        System.out.printf("Apr 15, 1994 @ 11:30am: %s%n",
                LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));

        System.out.printf("hozir (Instant'dan): %s%n",
                LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));

        System.out.printf("6 oydan keyin: %s%n",
                LocalDateTime.now().plusMonths(6));

        System.out.printf("6 oy oldin: %s%n",
                LocalDateTime.now().minusMonths(6));
    }
}
