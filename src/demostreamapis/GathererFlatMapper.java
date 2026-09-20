package demostreamapis;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class GathererFlatMapper {

    public static <E, R, RR> Gatherer<E, ?, RR> fusing(
            Function<E, R> mapper, Predicate<R> filter, Function<R, Stream<RR>> flatMapper) {

        Gatherer.Integrator<Void, E, RR> integrator =
                (_, element, downstream) -> {
                    var mapped = mapper.apply(element);
                    if (filter.test(mapped)) {
                        try (var flatMapped = flatMapper.apply(mapped)) {
                            return flatMapped == null || flatMapped.sequential().allMatch(downstream::push);
                        }
                    }
                    return true;
                };
        Gatherer<E, ?, RR> gatherer = Gatherer.of(integrator);
        return gatherer;
    }
    static void main() {

        Function<String, String> mapper = String::toUpperCase;
        Predicate<String> filter = s -> s.length() == 2;
        Function<String, Stream<String>> flatMapper =
                s -> s.chars().mapToObj(Character::toString);
        Gatherer<String, ?, String> fusedGatherer = fusing(mapper, filter, flatMapper);

        var result = Stream.of("yak", "du", "se")
                .gather(fusedGatherer)
                .toList();

        IO.println("natija = " + result);
    }
}
