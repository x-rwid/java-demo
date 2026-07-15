package cases;

import java.util.Arrays;

public class ArrCopy {
    static void main() {
        // 2D Array - array'ni nusxalaw dasturi

        // Array'ni Nusxalaw - System.arraycopy
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[5];
        System.arraycopy(source, 0, destination, 0, source.length);

        IO.println("");
        IO.println("System.arraycopy'dan foydalaniw:");
        IO.println("Manba: " + Arrays.toString(source));
        IO.println("Manzil: " + Arrays.toString(destination));

        // Array'ni Nusxalaw - Mustaqillikni Tuwuniw
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        // qo'lda nusxalaw
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        IO.println("Asl: " + Arrays.toString(original));
        IO.println("Nusxa: " + Arrays.toString(copy));

        // ular mustaqil ekanligini ko'rsatiw ucun nusxasini o'zgartiriw
        copy[0] = 999;
        copy[4] = 777;

        IO.println("");
        IO.println("Nusxasi o'zgargandan keyin:");
        IO.println("Asl: " + Arrays.toString(original));
        IO.println("Nusxa: " + Arrays.toString(copy));
    }
}
