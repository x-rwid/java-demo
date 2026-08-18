package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionSzEmp {
    static void main() {

        Collection<String> strings = new ArrayList<>();
        strings.add("yak");
        strings.add("du");
        if (!strings.isEmpty()) {
            IO.println("Darhaqiqat string'lar bo'w emas");
        }
        IO.println("String'larda element'lar adadi " +  strings.size() + " ta");
    }
}
