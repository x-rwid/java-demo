package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSublistRotate {
    static void main() {

        List<String> strings = Arrays.asList("0", "1", "2", "3", "4");
        IO.println(strings);
        int fromIndex = 1;
        int toIndex = 4;
        Collections.rotate(strings.subList(fromIndex, toIndex), -1);
        IO.println(strings);
    }
}
