package cases;

import java.util.Scanner;

public class NumPosNeg {
    static void main() {
        // Musbat, Manfiy va 0 Sonlarni Aniqlaw Dasturi

        Scanner scan = new Scanner(System.in);

        IO.print("Raqam kiritin: ");
        int num = scan.nextInt();

        if (num > 0)  {
            IO.println(num + " = musbat son");
        } else if (num < 0) {
            IO.println(num + " = manfiy son");
        } else {
            IO.println(num + " = 0 son");
        }
        scan.close();
    }
}
