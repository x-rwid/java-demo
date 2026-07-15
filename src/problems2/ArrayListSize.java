package problems2;

import java.util.ArrayList;

public class ArrayListSize {
    static void main() {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("qora");
        colors.add("jigarrang");
        colors.add("qizil");
        colors.add("yawil");
        colors.add("moviy");
        colors.add("sariq");
        colors.add("oq");

        IO.println("Ranglar: " + colors);

        colors.set(1, "binafwarang");
        IO.println("1 ci element o'zgargandan keyin: " + colors);

        IO.println("\n To'plamdagi element'lar:");
        for (String color : colors) {
            IO.println("- " + color);
        }
        IO.println("To'plamni umumiy hajmi: " + colors.size());
    }
}
