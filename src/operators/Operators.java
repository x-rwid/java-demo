package operators;

public class Operators {
    static void main() {

        // Operator Ustuvorligi
        int result = 10 + 20 * 30;
        IO.println("Natija: " + result);

        // Operator Werikligi
        int result1 = 100 + 200 / 10 - 3 * 10;
        IO.println("Yakuniy natija: " + result1);

        // Capdan O'ngga
        int a = 10, b = 5, j = 2;
        int result2 = a - b + j; // (10 - 5) + 2 = 7
        IO.println("Yakuniy natija: " + result2);

        // O'ngdan Capga
        int a1, b1;
        a1 = b1 = 4; // a1 = (b1 = 4) deya baholanadi
        IO.println("a1: " + a1);
        IO.println("b1: " + b1);

        // Primary Operator'lar
        String s = "Salam!";
        int len = s.length();        // . orqali member'ga kiriw
        char c = s.toCharArray()[0]; // [] orqali array'ga kiriw
        Object obj = "String";
        String str = (String) obj;    // (tur) casting
        IO.println(s);               // method caqiriw
    }
}
