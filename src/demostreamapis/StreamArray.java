package demostreamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamArray {
    static void main() {

        String[] stringArray = {"yak", "du", "se"};
        Stream<String> stringStream = Arrays.stream(stringArray);
        List<String> strings = stringStream.collect(Collectors.toList());
        IO.println("string'lar = " +  strings);
    }
}
