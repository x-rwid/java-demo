package demostreamapis;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorInterface {
    static void main() {

        Collection<String> strings =
                List.of("two", "three", "four", "five", "six",
                        "seven", "eight", "nine", "ten",  "eleven", "twelve");

        Collector<String, ?, List<String>> listCollector = Collectors.toList();
        List<String> list = strings.stream().collect(listCollector);
        IO.println("list'ni hajmi: " + list.size());

        Collector<String, ?, Set<String>> setCollector = Collectors.toSet();
        Set<String> set = strings.stream().collect(setCollector);
        IO.println("set'ni hajmi: " + set.size());

        Collector<String, ?,Map<Integer, Long>> groupingBy = Collectors.groupingBy(String::length, Collectors.counting());
        Map<Integer, Long> map = strings.stream().collect(groupingBy);
        IO.println("map'ni hajmi: " + map.size());
    }
}

