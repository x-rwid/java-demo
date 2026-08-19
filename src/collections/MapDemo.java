package collections;

import java.util.Map;

public class MapDemo {
    static void main() {

        // bu naqwdan faqat 10 tadan ortiq bo'lmagan kalit/qiymat juftliklarida foydalaniw mumkin

        Map<Integer, String> map = Map.of(
                1, "yak",
                2, "du",
                3, "se"
        );
        IO.println("Map: " + map);
    }
}
