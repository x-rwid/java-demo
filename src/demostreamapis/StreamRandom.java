package demostreamapis;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamRandom {
    static void main() {

        // 1 ci naqw
        Random random = new Random(314L);
        List<Integer> randomInts = random.ints(10, 1, 5)
                .boxed()
                .toList();
        IO.println("random int'lar" + randomInts);

        // 2 ci naqw
        List<Boolean> booleans = random.doubles(1_000, 0d, 1d)
                .mapToObj(rand -> rand <= 0.8) // ehtimallikni wu yerda sozlaw mumkin
                .toList();

        // list'dagi true sonini sanaw
        long numberOfTrue = booleans.stream()
                .filter(b -> b)
                .count();
        IO.println("true soni = " +  numberOfTrue);

        // 3 ci naqw
        List<String> letters = random.doubles(1_000, 0d, 1d)
                .mapToObj(rand ->
                        rand < 0.5 ? "A" : // A ni 50%
                        rand < 0.8 ? "B" : // B ni 30%
                        rand < 0.9 ? "C" : // C ni 10%
                        "D") // D ni 10%
                .toList();

        Map<String, Long> map = letters.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((letter, number) -> IO.println(letter + " :: " + number));
    }
}
