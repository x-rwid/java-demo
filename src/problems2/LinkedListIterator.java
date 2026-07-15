package problems2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
    static void main() {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Olma");
        fruits.add("Nok");
        fruits.add("Waftoli");
        fruits.add("Urik");

        IO.println("To'plamni element'lari:");
        printElements(fruits);

        IO.println("To'plamni dastlabki hajmi: " + fruits.size());

        IO.println("To'plamni tozalaw");
        fruits.clear();

        IO.println("Tozalawdan keyingi to'plam: " + fruits.size());
    }

    public static void printElements(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            IO.println("- " + iterator.next());
        }
    }
}
