package problems2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {
    static void main() {

        ArrayList<String> trees = new ArrayList<>();
        trees.add("arca");
        trees.add("eman");
        trees.add("qayin");
        trees.add("cinor");

        IO.println("Asl: " + trees);

        Collections.reverse(trees);
        IO.println("Teskari: " + trees);

        List<String> sub = trees.subList(1, 3);
        IO.println("Kicik qatlam: " + sub);
    }
}
