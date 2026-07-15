package arrays;

import java.util.Scanner;

public class ArrDynamic {
    static void main() {
        // 1D Array - dynamic uslub

        Scanner scanner = new Scanner(System.in); // Scanner'dan object oliw
        IO.print("\nRaqam kiritin: ");

        int n = scanner.nextInt();                // array'ni o'lcamini kiritiw
        int array[] = new int[n];                 // array ociw - necci kirtilsa n turida array'ni tuzadi
        for (int i = 0; i < n; i++) {             // har safar klaviatura orqali kiritilgan raqamni
            array[i] = scanner.nextInt(); // array'ga o'zlawtiriw - array i teng klaviatura'dan kirgan int qiymatiga
        }
        for (int i = 0; i < n; i++) {             // for loop'da n gaca aylaniw
            IO.print(array[i] + " ");            // avval uzunlik kiritiladi, keyin uzunlik soni bo'yica sonlar kirirtiladi
        }
    }
}
