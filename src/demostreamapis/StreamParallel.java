package demostreamapis;

import java.util.stream.IntStream;

public class StreamParallel {
    static void main() {

        int parallelSum =
                IntStream.range(0, 10)
                        .parallel()
                        .sum();

        IO.println("sum = " + parallelSum);
    }
}
