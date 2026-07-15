package cases;

import java.util.Scanner;

public class NumPrime {
    static void main() {
        // continue - label: nested loop'da tub sonlarni aniqlaw

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        out:
        for (int i = 2; i <= n; i++) {        // 2 dan bowlab n gaca sonlarni i (11) gaca taqsimlaydi
            for (int j = 2; j < i / 2; j++) { // nested loop i ni har davrada j ga taqsimlaydi
                if (i % j == 0) {             // i ni j ga qoldiqli taqsimlaydi va agar qoldiq 0 bo'lsa
                    continue out;
                }
            }
            IO.println(i);
        }
    }
}
