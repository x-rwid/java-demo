package statements;

import java.util.Scanner;

public class IfNested {
    static void main() {
        // nested if: sonni toq yo juft va 5 ga taqsimlaniw yo taqsimlanmasligini aniqlovci dastur

        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        if (numbers % 2 == 0) {
            if (numbers % 5 == 0) {
                IO.println(numbers + " bu son juft va 5 ga taqsimlanadi.");
            } else {
                IO.println(numbers + " bu son juft, lekin 5 ga taqsimlanmaydi.");
            }
        } else {
            if (numbers % 5 == 0) {
                IO.println(numbers + " bu son toq va 5 ga taqsimlanadi.");
            } else {
                IO.println(numbers + " bu son toq, lekin 5 ga taqsimlanmaydi.");
            }
        }
    }
}
