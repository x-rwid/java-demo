package demostreamapis;

import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Gatherers;

public class GathererFixedWindow {
    static void main() {

        var strings = List.of("yak", "du", "se", "cor", "panj");

        Gatherer<String, ?, List<String>> fixedWindow = Gatherers.windowFixed(2);

        var result = strings.stream().gather(fixedWindow).toList();

        IO.println("natija = " + result);
    }
}
