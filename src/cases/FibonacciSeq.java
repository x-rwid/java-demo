package cases;

import java.util.Scanner;

public class FibonacciSeq {
    static void main() {
        // Fibonacci Ketma Ketligi

        Scanner scan = new Scanner(System.in);
        IO.print("Raqam kiritin: ");

        if (!scan.hasNextInt()) {
            IO.println("Error: Kiritilgan ma'lumat xato. Iltimos, butun son kiritin.");
            return;
        }

        int maxNum = scan.nextInt();
        scan.close();

        if (maxNum <= 0) {
            IO.println("Musbat son kiritin.");
            return;
        }

        int first = 1;
        int second = 1;
        String result = "";

        while (first <= maxNum) {
            result += first + " ";
            int next = first + second;
            first = second;
            second = next;
        }
        IO.println(result.trim().replace(" ", " "));
    }
}
