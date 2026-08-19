package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListWrapper {
    static void main() {

        List<String> strings = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4"));
        List<String> unmodifiableStrings = Collections.unmodifiableList(strings);
        IO.println(unmodifiableStrings);
        strings.add("5");
        IO.println(unmodifiableStrings);
    }
}
