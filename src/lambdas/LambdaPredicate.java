package lambdas;

import java.util.function.Predicate;

public class LambdaPredicate {
    static void main() {
        // Predicate biron narsani oladi, boolean qaytaradi

        Predicate<String> hasFourChars = s -> s.length() == 4;
        IO.println("'Duke' 4 ta belgiga egami? " +  hasFourChars.test("Duke"));
        IO.println("'yoqtirmoq' 8 ta belgiga ega: " + hasFourChars.test("yoqtirmoq"));
        IO.println("'Java' 4 ta belgiga ega: " + hasFourChars.test("Java"));
    }
}
