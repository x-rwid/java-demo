package collections;

import java.util.Map;

public class MapDemo2 {
    static void main() {

        // bu naqwdan 10 tadan ortiq kalit/juftliklarida foydalaniw mumkin

        Map.Entry<Integer, String> e1 = Map.entry(1, "yak");
        Map.Entry<Integer, String> e2 = Map.entry(2, "du");
        Map.Entry<Integer, String> e3 = Map.entry(3, "se");

        Map<Integer, String> map = Map.ofEntries(e1,e2, e3);

        IO.println("Map: " + map);
    }
}
