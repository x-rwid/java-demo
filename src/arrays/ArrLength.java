package arrays;

import java.util.Arrays;

public class ArrLength {
    static void ArrLength(String[][] strings) {

        // 2D Array - Array Uzunligidan Foydalaniw
        // method'ni bu yerga o'tkazib, uni static holatga keltiriw
        for (int arrayIndex = 0; arrayIndex < strings.length; arrayIndex++) {
            for (int index = 0; index < strings[arrayIndex].length; index++) {
                IO.print(strings[arrayIndex][index] + " ");
            }
            IO.println();
        }
    }

    static void main() {

        // jagged array'ni iwga tuwiriw
        String[][] strings = {
                {"ismlar:"},
                {"Maryam", "Sofiya", "Layla"},
                {"Ibrohim", "Sulayman"},
                {"Andijan", "Samarqand", "Nasaf", "Xorazm"}
        };
        ArrLength(strings); // method'ni caqiriw
        IO.println("");

        // Array'larni Nusxalaw - System.arraycopy | qahva misali
        String[] copyFrom = {
                "Affogato", "Americano", "Arabica", "Cappuccino", "Corretto",
                "Doppio", "Espresso", "Frappucino", "Java", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            IO.print(coffee + " ");
        }
        IO.println("");

        // Array Manipulation'lari | avvalgi dastur ila bir xil, bunda code kamro
        String[] nusxaDan = {
                "Affogato", "Americano", "Arabica", "Cappuccino", "Corretto",
                "Doppio", "Espresso", "Frappucino", "Java", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] nusxaGa = Arrays.copyOfRange(nusxaDan, 2, 9);
        for (String qahva : nusxaGa) {
            IO.print(qahva + " ");
        }
    }
}