package collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class ListSet {
    static void main() {

        List<String> numbers = Arrays.asList("yak", "du", "se");
        for (ListIterator<String> iterator = numbers.listIterator(); iterator.hasNext(); ) {
            String nextElement = iterator.next();
            if (Objects.equals(nextElement, "du")) {
                iterator.set("2");
            }
        }
        IO.println("raqamlar: " + numbers);
    }
}
