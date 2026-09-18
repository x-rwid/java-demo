package demostreamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArrList {
    static void main() {

        Stream<Integer> ints = IntStream.range(0, 10_000).boxed();
        List<String> result = ints.map(i -> Integer.toString(i))
                .collect(Collectors.toCollection(() -> new ArrayList<>(10_000)));
        IO.println("# natija = " + result.size());
    }
}
