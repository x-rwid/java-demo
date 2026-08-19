package collections;

import java.util.ArrayList;
import java.util.List;

public class ListClr {
    static void main() {

        List<String> strings = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5"));
        IO.println(strings);
        strings.subList(2, 5).clear();
        IO.println(strings);
    }
}
