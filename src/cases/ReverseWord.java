package cases;

import java.util.Scanner;

public class ReverseWord {
    static void main() {
        // So'zlarni Teskari Ugiriw Dasturi

        Scanner scanner = new Scanner(System.in);
        IO.print("So'zni kiritin: ");

        String word = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        IO.println(reversed.toString());

        scanner.close();
    }
}
