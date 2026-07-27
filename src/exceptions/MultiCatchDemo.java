package exceptions;

public class MultiCatchDemo {
    static void main() {

        String[] testData = {"10", "abc", "0", "5", "salam"};
        int[] divisors = {2, 2, 1, 0, 3};

        for (int i = 0; i < testData.length && i < divisors.length; i++) {
            try {
                String data = testData[i];
                int number = Integer.parseInt(data);
                int result = number / divisors[i];
                IO.println(data + " / " + divisors[i] + " = " + result);
            } catch (NumberFormatException | ArithmeticException e) {
                IO.println("Exception: " + e);
            }
        }
    }
}
