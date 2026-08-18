package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

public class CollectionRmvIf {
    static void main() {

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

        Collection<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("");
        strings.add("yak");
        strings.add("du");
        strings.add("");
        strings.add("se");
        strings.add(null);

        IO.println("string'lar = " + strings);
        strings.removeIf(isNullOrEmpty);
        IO.println("filter'langan string'lar = " + strings);
    }
}
