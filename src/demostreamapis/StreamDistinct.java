package demostreamapis;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDistinct {
    static void main() {

        var ints = IntStream.iterate(0, i -> i + 1)
                .map(i -> i / 3)
                .distinct()
                .limit(5)
                .toArray();
        IO.println("int'lar: " + Arrays.toString(ints));
    }
}
