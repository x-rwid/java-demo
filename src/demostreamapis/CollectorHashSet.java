package demostreamapis;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorHashSet {
    static void main() {

        Set<Integer> noDuplicates =
                IntStream.range(0, 10)
                        .map(number -> number / 2)
                        .boxed()
                        .collect(Collectors.toSet());
        IO.println("bowqa duplicate'lar yo'q? " + noDuplicates);
    }
}
