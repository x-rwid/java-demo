package demostreamapis;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamRange {
    static void main() {

        String[] letters = {"alif", "ba", "ta", "sa"};

        List<String> listLetters = IntStream.range(0, 10)
                .mapToObj(index -> letters[index % letters.length])
                .collect(Collectors.toList());
        IO.println("list harflari = " + listLetters);
    }
}
