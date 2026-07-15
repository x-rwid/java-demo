package cases;

import java.util.Scanner;

public class ArrMaxNum {
    static void main() {
        // Array - array'da eng katta sonni topiw dasturi

        Scanner scan = new Scanner(System.in);
        IO.print("\nRaqam kiritin: ");

        int m = scan.nextInt();
        int b[] = new int[m];         // a[] = array, [m] = uzunlik (istalganca)
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();    // klaviatura'dan kiritiw
        }
        int max = b[0];               // max = variable = 0 - be taraf raqam - eng katta sonni topiw ucun
        for (int i = 0; i < m; i++) { // for loop'da m gaca aylaniw
            if (b[i] > max) {         // agar array'dagi qaysidir index son katta max'dan bo'lsa,
                max = b[i];           // max teng bo'lsin array'dagi index son'ga
            }
        }
        IO.println(max);          // avval uzunlik kiritiladi, keyin uzunlik soni bo'yica sonlar kirirtiladi
    }
}
