package collections;

import java.util.ArrayList;
import java.util.List;

public class ListAddAll {
    static void main() {

        List<String> strings = new ArrayList<>(List.of("0", "1", "5"));
        List<String> toBeInserted = List.of("2", "3", "4");
        IO.println("String'lar: " + strings);
        IO.println("Kiritiliwi kerka: " + toBeInserted);
        IO.println("2 ci index'da kiritiw");
        strings.addAll(2, toBeInserted);
        IO.println("String'lar: " + strings);
    }
}
