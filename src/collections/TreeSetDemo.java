package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    static void main() {

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(1);
        tree.add(2);
        tree.add(3);

//        IO.println(tree); // cop etiw

//        IO.println(tree.descendingSet()); // kamayiw tartibida cop etiw

//        IO.println(tree.pollFirst()); // eng kicik qiymatni olib, cop etadi
//        IO.println(tree.pollLast()); // eng katta qiymatni olib, cop etadi
//

        // Java 7 va undan quyi talqinlar ucun Set'da cop etiw
        Iterator iterator = tree.iterator();
        while (iterator.hasNext()) {
            IO.println(iterator.next());
        }
    }
}
