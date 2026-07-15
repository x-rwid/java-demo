package cases;

import java.util.Scanner;

public class GrantScore {
    static void main() {

        // if-else if - Mandat Natija Dasturi

        Scanner scanner = new Scanner(System.in);

        IO.print("Grant o'tiw ball'ini kiritin: ");
        int grantScore = scanner.nextInt();

        IO.print("Contract o'tiw ball'ini kiritin: ");
        int contractScore = scanner.nextInt();
        int score = scanner.nextInt();

        if (score >= grantScore) {
            IO.println("Siz grant asosida o'qiwga qabul qilindiz.");
        } else if (score >= contractScore &&  score < grantScore) {
            IO.println("Siz contract asosida o'qiwga qabul qilindiz.");
        } else {
            IO.println("Siz talabalikka qabul qilinmadiz. Afsusdamiz. Ilm oliwda to'xtaman.");
        }
    }
}
