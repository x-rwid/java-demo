package problems2;

import java.util.TreeMap;

public class TreeMapReverse {
    static void main() {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Bahodir");
        map.put(33, "Alp");
        map.put(300, "Spartalik");

        IO.println("Avvalgi element: " + map.firstEntry());
        IO.println("Oxirgi element: " + map.lastEntry());

        IO.println("Kalitlar teskari tartibda: " + map.descendingKeySet());
    }
}
