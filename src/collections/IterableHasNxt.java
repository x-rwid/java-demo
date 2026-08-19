package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IterableHasNxt {
    static void main() {

        Collection<String> strings = List.of("yak", "du", "se", "cor");
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); ) {
            String element = iterator.next();
            if (element.length() == 3) {
                IO.println(element);
            }
        }
    }
}
