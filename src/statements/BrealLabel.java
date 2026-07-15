package statements;

public class BrealLabel {
    static void main() {
        // break - label

        int[][] arrayOfInts2 = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955},
        };
        int searchfor2 = 12;

        int j;
        int k = 0;
        boolean foundIt2 = false;

        search:
        for (j = 0; j < arrayOfInts2.length; j++) {
            for (k = 0; k < arrayOfInts2[j].length; k++) {
                if (arrayOfInts2[j][k] == searchfor2) {
                    foundIt2 = true;
                    break search;
                }
            }
        }
        if (foundIt2) {
            IO.println("Raqam " + searchfor2 + " wu manzilda: " + j + ", " + k);
        } else {
            IO.println(searchfor2 + " array'da emas.");
        }
    }
}
