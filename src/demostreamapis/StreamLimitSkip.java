package demostreamapis;

import java.util.List;

public class StreamLimitSkip {
    static void main() {

        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result = ints.stream()
                .skip(2)
                .limit(5)
                .toList();
        IO.println("natija = " + result);
    }
}
