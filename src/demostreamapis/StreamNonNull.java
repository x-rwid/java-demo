package demostreamapis;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamNonNull {
    static void main() {

        Predicate<Stream<?>> isNonNull = stream ->
                ((stream.spliterator().characteristics() & Spliterator.NONNULL) != 0);

        Map<Integer, String> hashMap = new HashMap<>();

        Collection<String> values = hashMap.values();
        IO.println("hash map qiymatlari null emasmi? " + isNonNull.test(values.stream()));

        Collection<String> queue = new ArrayDeque<String>();
        IO.println("ArrayDeque null emasmi? " + isNonNull.test(queue.stream()));
    }
}
