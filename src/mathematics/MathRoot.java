package mathematics;

import java.util.Scanner;

public class MathRoot {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        double x, root;

        IO.print("Raqam kiritin: ");
        x = scanner.nextDouble();

        root = Math.sqrt(x);
        IO.println("Ildiz " + root);
        IO.println("x^3 = " + Math.pow(x,3));
    }
}
