package problems;

public class ArrEvenCounter {
    static void main() {
        // Array'dagi Juft Sonlar Miqdarini Aniqlaw

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int count = 0;

        for (int num :  numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        IO.println("Juft sonlar miqdari: " + count);
    }
}
