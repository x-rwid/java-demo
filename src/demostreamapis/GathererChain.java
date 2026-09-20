package demostreamapis;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class GathererChain {

    public static <E> Gatherer<E, ?, E> filtering(Predicate<E> filter) {
        Gatherer.Integrator<Void, E, E> integrator =
                (_, element, downstream) -> {
                    if (filter.test(element)) {
                        return downstream.push(element);
                    } else {
                        return true;
                    }
                };
        Gatherer<E, ?, E> gatherer = Gatherer.of(integrator);
        return gatherer;
    }

    public static <E, R> Gatherer<E, ?, R> mapping(Function<E, R> mapper) {
        Gatherer.Integrator<Void, E, R> integrator =
                (_, element, downstream) -> downstream.push(mapper.apply(element));
        Gatherer<E, ?, R> gatherer = Gatherer.of(integrator);
        return gatherer;
    }

    static void main() {

        Gatherer<String, ?, String> filter = filtering(s -> s.length() > 3);
        Gatherer<String, ?, String> mapper = mapping(String::toUpperCase);
        Gatherer<String, ?, String> filterThenMap = filter.andThen(mapper);

        var result = Stream.of("yak", "du", "se", "cor", "panj", "wiw", "haft")
                .gather(filterThenMap)
                .toList();

        IO.println("natija = " + result);
    }
}
