package demostreamapis;

import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamSized {
    static void main() {

        Predicate<Stream<?>> isSized = stream ->
                ((stream.spliterator().characteristics() & Spliterator.SIZED) != 0);
        Predicate<Stream<?>> isSubsized = stream ->
                ((stream.spliterator().characteristics() & Spliterator.SUBSIZED) != 0);

        IO.println("naqw bo'yica stream sifatida taqsimlaw sized'mi? " +
                isSized.test(Pattern.compile(" ").splitAsStream("Salam, Duke!")));
        IO.println("naqw bo'yica stream sifatida taqsimlaw subsized'mi? " +
                isSubsized.test(Pattern.compile(" ").splitAsStream("Salam, Duke!")));
    }
}
