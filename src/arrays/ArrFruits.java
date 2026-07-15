package arrays;

public class ArrFruits {
    static void main() {
        // 1D Array - uni iwga tuwiriwni qisqa xati

        String[] fruits = {"anor", "xurma", "zaytun", "anjir"};
        IO.println(""); // bo'w joy ucun
        IO.println("Mevalar Safi:");
        for (int i = 0; i < fruits.length; i++) {
            IO.println(i + ": " + fruits[i]);
        }

        // array'larni tuziw
        double[] prices = {9.99, 15.50, 7.25, 6.5};
        IO.println(""); // bo'w joy ucun
        IO.println("Narxlar:");
        for (double price : prices) {
            IO.println("$" + price);
        }
    }
}
