package demostreamapis;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {
    static void main() {

        Stream<Integer> ints = Stream.of(2, 8, 1, 5, 3);
        Optional<Integer> optional = ints.reduce((i1, i2) -> i1 > i2 ? i1 : i2);

        if (optional.isPresent()) {
            IO.println("natija = " + optional.orElseThrow());
        } else  {
            IO.println("Hec qanday natijani hisablab bo'lmadi.");
        }
    }
}
