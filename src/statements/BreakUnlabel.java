package statements;

public class BreakUnlabel {
    static void main() {
        // break - unlabel

        int[] arrayOfInts =
                {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }
        if (foundIt) {
            IO.println("Index 4 da " + searchfor + " raqam topildi." + i);
        } else {
            IO.println(searchfor + " array'da emas.");
        }
    }
}

