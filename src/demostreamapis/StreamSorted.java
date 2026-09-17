package demostreamapis;

import java.util.Comparator;
import java.util.List;

public class StreamSorted {
    static void main() {

        List<String> strings = List.of("yak", "du", "se", "cor");

        List<String> naturalSort = strings.stream()
                .sorted()
                .toList();
        IO.println("tabiiy sara: " + naturalSort);

        List<String> shortestFirst = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        IO.println("eng qisqasi birinci: " + shortestFirst);
    }
}
