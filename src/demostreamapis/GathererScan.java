package demostreamapis;

import java.util.stream.Gatherer;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class GathererScan {
    static void main() {

        var scan = Gatherers.<String, String>scan(() -> "{",
                (string, element) -> string + element);
        var finish = Gatherer.<String, String>ofSequential(
                (_, element, downstream) -> {
                    element += "}";
                    return downstream.push(element);
                });
        var result = Stream.of(1, 2, 3, 4)
                .map(Object::toString)
                .gather(scan.andThen(finish))
                .toList();
        IO.println("natija = " + result);
    }
}
