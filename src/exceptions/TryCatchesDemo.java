package exceptions;

public class TryCatchesDemo {
    static void main() {

        String[] words = {"123", "abc", "0"};
        for (int i = 0; i < words.length; i++) {
            try {
                String word = words[i];
                int number = Integer.parseInt(word);
                int result = 100 / number;
                IO.println("'" + word + "' natijasi: " + result);
            } catch (NumberFormatException e) {
                IO.println("'" + words[i] + "' yaroqli son emas");
            } catch (ArithmeticException e) {
                IO.println("0 ga taqsimlab bo'lmaydi");
            }
        }
    }
}
