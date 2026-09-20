package demostreamapis;

import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Gatherers;

public class GathererSlidingWindow {
    static void main() {

        var strings = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Gatherer<Integer, ?, List<Integer>> createSlidingWindows =
                Gatherers.windowSliding(3);
        Gatherer<List<Integer>, ?, Double> averagingDouble =
                Gatherer.of(
                        (_, element, downstream) -> {
                            var optAverage = element.stream()
                                    .mapToInt(i -> i)
                                    .average();
                            if (optAverage.isPresent()) {
                                return downstream.push(optAverage.getAsDouble());
                            } else {
                                return true;
                            }
                        }
                );

        var result = strings.stream()
                .gather(createSlidingWindows.andThen(averagingDouble))
                .toList();

        IO.println("natija = " + result);
    }
}
