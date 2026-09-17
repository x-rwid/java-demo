package demostreamapis;

import java.util.List;

public class StreamMapMulti {
    static void main() {

        List<String> strings = List.of("1", " ", "2", "3", "", "3");

        List<Integer> ints =
                strings.stream()
                        .<Integer>mapMulti(
                                (string, consumer) -> {
                                    try {
                                        consumer.accept(Integer.parseInt(string));
                                    } catch (NumberFormatException ignored) {
                                    }
                                })
                                .toList();
        IO.println("int'lar = " + ints);
    }
}
