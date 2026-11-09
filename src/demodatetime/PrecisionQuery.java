package demodatetime;

import java.time.*;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

public class PrecisionQuery {
    static void main() {

        TemporalQuery<TemporalUnit> query = TemporalQueries.precision();
        System.out.printf("LocalDate aniqligi bu %s%n",
                LocalDate.now().query(query));
        System.out.printf("LocalDateTime aniqligi bu %s%n",
                LocalDateTime.now().query(query));
        System.out.printf("Year aniqligi bu %s%n",
                Year.now().query(query));
        System.out.printf("YearMonth aniqligi bu %s%n",
                YearMonth.now().query(query));
        System.out.printf("Instant aniqligi bu %s%n",
                Instant.now().query(query));
    }
}
