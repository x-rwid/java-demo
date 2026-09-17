package demostreamapis;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamConcat {
    static void main() {

        List<Integer> list0 = List.of(1, 2, 3);
        List<Integer> list1 = List.of(4, 5, 6);
        List<Integer> list2 = List.of(7, 8, 9);

        // 1 ci naqw: concat
        List<Integer> concat = Stream.concat(list0.stream(), list1.stream()).toList();

        // 2 ci naqw: flatMap
        List<Integer> flatMap = Stream.of(list0.stream(), list1.stream(), list2.stream())
                .flatMap(Function.identity()).toList();

        IO.println("concat: " + concat);
        IO.println("flatMap: " + flatMap);
    }
}
