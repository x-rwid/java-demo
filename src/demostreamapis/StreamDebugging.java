package demostreamapis;

import java.util.List;

public class StreamDebugging {
    static void main() {

        List<String> strings = List.of("one", "two", "three", "four");

        List<String> result = strings.stream()
                .peek(s -> IO.println(s + " ila bowlaw"))
                .filter(s -> s.startsWith("t"))
                .peek(s -> IO.println("Filter'langan " + s))
                .map(String::toUpperCase)
                .peek(s -> IO.println("Map'langan = " + s))
                .toList();
        IO.println("natija = " + result);
    }
}
