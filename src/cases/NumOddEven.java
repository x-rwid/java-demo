package cases;

import java.util.Scanner;

public class NumOddEven {
    static void main() {
        // if-else - Toq va Juft Sonlarni Aniqlaw Dasturi

        Scanner scanner =  new Scanner(System.in);

        IO.print("Raqam kiritin: ");
        int number =  scanner.nextInt();

        if (number % 2 == 0) {
            IO.println(number + " = juft son");
        } else {
            IO.println(number + " = toq son");
        }
    }
}
