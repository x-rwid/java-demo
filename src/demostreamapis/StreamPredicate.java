package demostreamapis;

import java.util.Collection;
import java.util.List;

public class StreamPredicate {
    static void main() {

        Collection<String> empty = List.of();

        boolean allMatchTrue = empty.stream()
                .allMatch(_ -> true);
        boolean allMatchFalse = empty.stream()
                .allMatch(_ -> false);
        boolean anyMatchTrue = empty.stream()
                .anyMatch(_ -> true);
        boolean anyMatchFalse = empty.stream()
                .anyMatch(_ -> false);
        boolean noneMatchTrue = empty.stream()
                .noneMatch(_ -> true);
        boolean noneMatchFalse = empty.stream()
                .noneMatch(_ -> false);

        IO.println("allMatchTrue = " + allMatchTrue);
        IO.println("allMatchFalse = " + allMatchFalse);
        IO.println("anyMatchTrue = " + anyMatchTrue);
        IO.println("anyMatchFalse = " + anyMatchFalse);
        IO.println("noneMatchTrue = " + noneMatchTrue);
        IO.println("noneMatchFalse = " + noneMatchFalse);
    }
}
