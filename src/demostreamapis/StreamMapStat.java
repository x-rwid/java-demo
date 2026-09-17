package demostreamapis;

import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamMapStat {
    static void main() {

        List<String> strings = List.of("yak", "du", "se", "cor");

        IntSummaryStatistics stats = strings.stream()
                .mapToInt(String::length)
                .summaryStatistics();

        IO.println("statistika = " + stats);
    }
}
