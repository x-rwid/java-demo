package cases;

import java.util.Scanner;

public class DivDouble {
    static void main() {
        // Arithmetic Operator'lar - taqsimlaw

        int a, b;
        Scanner input = new Scanner(System.in);

        IO.print("a = ");
        a = input.nextInt();
        IO.print("b = ");
        b = input.nextInt();

        double result = (double) a / b;
        IO.println(result);
    }
}
