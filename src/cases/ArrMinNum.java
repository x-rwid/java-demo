package cases;

import java.util.Scanner;

public class ArrMinNum {
    static void main() {
        // Array - array'dagi eng kicik sonni topiw dasturi

        Scanner scan1 = new Scanner(System.in);
        IO.print("Raqam kiritin: ");

        int k = scan1.nextInt();
        int c[] = new int[k];         // c[] = array, [k] = uzunlik (istalganca)
        for (int i = 0; i < k; i++) {
            c[i] = scan1.nextInt();   // klaviatura'dan kiritiw
        }
        int min = c[0];               // min = variable = 0 - be taraf raqam - eng kicik sonni topiw ucun
        for (int i = 0; i < k; i++) { // for loop'da k gaca aylaniw
            if (c[i] < min) {         // agar array'dagi qaysidir index son kicik min'dan bo'lsa,
                min = c[i];           // min teng bo'lsin array'dagi index son'ga
            }
        }
        IO.println(min);
    }
}
