package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    static void main() {

        Collection<String> strings = new ArrayList<>();
        strings.add("yak");
        strings.add("du");

        if (strings.contains("yak")) {
            IO.println("yak wu yerda");
        }

        if (!strings.contains("se")) {
            IO.println("se bu yerda emas");
        }

        record User(String name) {}

        User xurwid = new User("Xurwid");
        if (!strings.contains("xurwid")) {
            IO.println("Xurwid bu yerda emas");
        }
    }
}
