package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    static void main() {

        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        IO.println(list.getFirst());
        IO.println(list.getLast());
    }
}
