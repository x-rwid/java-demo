package demostreamapis;

import java.util.Comparator;
import java.util.Map;

public record NumberOfLength(int length, long number) {

    static NumberOfLength fromEntry(Map.Entry<Integer, Long> entry) {
        return new NumberOfLength(entry.getKey(), entry.getValue());
    }

    static Comparator<NumberOfLength> comparingByNumber() {
        return Comparator.comparing(NumberOfLength::number);
    }
}
