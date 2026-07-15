package problems;

public class HalfPyramid {
    static void main() {
        // nested loop - Yarim Pyramid Dasturi

        int rows = 5;
        // outer loop
        for (int i = 1; i <= rows; ++i) {
            // inner loop
            for (int j = 1; j <= i; ++j) {
                IO.print(j + " ");
            }
            IO.println("");
        }
    }
}
