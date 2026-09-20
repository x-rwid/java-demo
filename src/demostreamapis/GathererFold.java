package demostreamapis;

import java.util.stream.Gatherer;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class GathererFold {
    static void main() {

        var fold = Gatherers.<String, String>fold(() -> "{",
                (string, element) -> string + element);
        var finish = Gatherer.<String, String>ofSequential(
                (_, element, downstream) -> {
                    element += "}";
                    return downstream.push(element);
                });
        var result = Stream.of(1, 2, 3, 4)
                .map(Object::toString)
                .gather(fold.andThen(finish))
                .findFirst().orElseThrow();
        IO.println("natija = " + result);
    }
}
