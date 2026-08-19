package collections;

import java.util.Map;

public class MapDemo3 {
    static void main() {

        // bu naqwni o'qiliwini yaxwilaw ucun static import'lardan foydalaniw mumkin

        Map<Integer, String> map = Map.ofEntries(
                Map.entry(1, "yak"),
                Map.entry(2, "du"),
                Map.entry(3, "se"));
        IO.println("Map: " + map);
    }
}
