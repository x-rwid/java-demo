package demostreamapis;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfLengthDemo {
    static void main() {

        Collection<String> strings =
                List.of("one", "two", "three", "four",
                        "five", "six", "seven", "eight",
                        "nine", "ten", "eleven", "twelve");

        Map<Integer, Long> histogram =
                strings.stream()
                        .collect(
                                Collectors.groupingBy(
                                        String::length,
                                        Collectors.counting()));

        NumberOfLength maxNumberOfLength =
                histogram.entrySet().stream()
                        .map(NumberOfLength::fromEntry)
                        .max(NumberOfLength.comparingByNumber())
                        .orElseThrow();

        IO.println("maxNumberOfLength = " + maxNumberOfLength);
    }
}
