package demostreamapis;

import java.util.List;

public class StreamMapToList {
    static void main() {

        List<String> strings = List.of("yak", "du", "se", "cor");

        List<Integer> lengths = strings.stream()
                .map(String::length)
                .toList();

        IO.println("uzunliklar" + lengths);
    }
}
