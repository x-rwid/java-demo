package demostreamapis;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamSpliterator {
    static void main() {

        Predicate<Stream<?>>isOrdered = stream ->
                ((stream.spliterator().hasCharacteristics(Spliterator.ORDERED)));

        Stream<Integer> stream = List.of(1, 2, 3).stream();

        boolean ordered = isOrdered.test(stream);
        IO.println("tartiblangan = " + ordered);
    }
}
