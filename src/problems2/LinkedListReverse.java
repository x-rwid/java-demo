package problems2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {

    public static void displayReverse(LinkedList<String> list){
        Iterator<String> reverseIterator = list.descendingIterator();

        while(reverseIterator.hasNext()){
            IO.print(reverseIterator.next() + " ");
        }
        IO.println();
    }

    static void main() {
        LinkedList<String> list = new LinkedList<>();

        list.add("Element 1");
        list.add("Element 2");
        IO.println("Asl Ruyxat: " + list);

        list.add("Element 3");
        list.add("Element 4");
        IO.println("Qo'wilgandan Keyingi Ruyxat: " + list);

        String first = list.getFirst();
        String last = list.getLast();
        IO.println("Avvalgi Element: " + first);
        IO.println("Oxirgi Element: " + last);

        IO.print("Teskari Tartib: ");
        displayReverse(list);
    }
}
