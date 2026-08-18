package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionClr {
    static void main() {

        Collection<String> strings = new ArrayList<>();

        strings.add("yak");
        strings.add("du");
        IO.println("String'larda element'lar adadi " +  strings.size() + " ta");

        strings.clear();
        IO.println("U tozalangandan keyin bu adad endi " + strings.size() + " ta");
    }
}
