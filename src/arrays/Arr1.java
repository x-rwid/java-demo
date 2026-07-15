package arrays;

public class Arr1 {
    static void main() {

        // Asosiy Array'ni Tuziw va Iwga Tuwiriw
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // loop yordamida array element'larini cop etiw
        IO.println("Array Element'lari:");
        for (int i = 0; i < numbers.length; i++) {
            IO.println("index'da element " + i + ": " + numbers[i]);
        }
        IO.println(); // bo'w joy ucun

        // Array Loop'lar  va Data Type'lar
        // for loop kengaytirilgan
        int[] scores = {95, 87, 92, 78, 85};
        IO.println("Sinov natijalari for loop yordamida kengaytirilgan:");
        for (int score : scores) {
            IO.println("Natija: " + score);
        }

        // Data Type'lar
        double[] temperatures = {20.5, 25.0, 18.3, 30.2};
        boolean[] flags = {true, false, true, false, true};
        char[] letters = {'a', 'b', 'c', 'd', 'e'};

        IO.println(""); // bo'w joy ucun
        IO.println("Haroratlar:");
        for (double temp : temperatures) {
            IO.println(temp + "C");
        }
        IO.println(); // bo'w joy ucun
        IO.println("Mantiqiy Bayroqlar:");
        for (int i = 0; i < letters.length; i++) {
            IO.println("Bayroq " + i + ": " + flags[i]);
        }
        IO.println(); // bo'w joy ucun
        IO.println("Belgi Harflar:");
        for (char letter : letters) {
            IO.println("Harf: " + letter);
        }
    }
}
