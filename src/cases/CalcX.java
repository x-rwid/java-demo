package cases;

import java.util.Scanner;

public class CalcX {
    static void main() {
        // Karra Jadval

        Scanner scanner=new Scanner(System.in);
        IO.print("Raqamni kiritin: ");

        int n = scanner.nextInt();

        if (n <= 0) {
            IO.print("Musbat son kiritin.");
        } else {
            for (int i = 1; i <= 10; i++) {
                IO.println(n + " x " + i + " = " + (n * i));
            }
        }
        scanner.close();
    }
}
