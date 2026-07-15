package problems2;

import java.util.LinkedList;

public class LinkedListRemove {

    public static void removeIndex(LinkedList<String> list, int index){
        if (index >= 0 && index < list.size()){
            String removed = list.remove(index);
            IO.println(index + " ci index'dan olib tawlandi: " + removed);
        } else {
            IO.println("Index " + index + " cegaradan tawqarida!");
        }
    }

    public static void removeFirstLast(LinkedList<String> list) {
        if (list.isEmpty()){
            IO.println("Ruyxat bo'w. Element'larni olib tawlaw mumkin emas.!");
            return;
        }

        if (list.size() == 1) {
            String removed = list.removeFirst();
            IO.println("Avvalgi va oxirgi element olib tawlandi: " + removed);
            return;
        }

        String first = list.removeFirst();
        String last = list.removeLast();

        IO.println("Avvalgi element olib tawlandi: " + first);
        IO.println("Oxirgi element olib tawlandi: " + last);
    }

    public static void removeAllElements(LinkedList<String> list) {
        list.clear();
        IO.println("Hamma element'lar olib tawlandi. Ruyxat hajmi:: " + list.size());
    }

    static void main() {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Yong'oq");
        fruits.add("Funduk");
        fruits.add("Maymunjon");
        fruits.add("Pista");

        IO.println("Asl Ruyxat: " + fruits);

        removeIndex(fruits, 2);
        IO.println("Index olib tawlangandan keyin: " + fruits + "\n");

        removeFirstLast(fruits);
        IO.println("Cegara olib tawlangandan keyin: " + fruits + "\n");

        removeAllElements(fruits);
        IO.println("Yakuniy Ruyxat: " + fruits);
    }
}
