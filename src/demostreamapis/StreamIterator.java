package demostreamapis;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamIterator {
    static void main() {

        Iterator<Integer> iterator = new Iterator<Integer>() {
            private int index = 0;
            public boolean hasNext() {
                return index < 10;
            }
            public Integer next() {
                return index++;
            }
        };

        long estimateSize = 10L;
        int characteristics = 0;
        Spliterator<Integer> spliterator = Spliterators.spliterator(iterator, estimateSize, characteristics);

        boolean parallel = false;
        Stream<Integer> stream = StreamSupport.stream(spliterator, parallel);

        List<Integer> ints = stream.toList();
        IO.println("int'lar: " + ints);
    }
}
