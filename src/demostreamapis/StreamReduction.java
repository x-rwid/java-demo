package demostreamapis;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamReduction {
    static void main() {

        Stream<String> strings = Stream.of("yak", "du", "se", "cor");

        BinaryOperator<Integer> combiner = (length1, length2) -> length1 + length2;

        BiFunction<Integer, String, Integer> accumulator =
                (partialReduction, element) -> partialReduction + element.length();

        int result = strings.reduce(0, accumulator, combiner);
        IO.println("sum = " + result);
    }
}
