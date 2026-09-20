package demostreamapis;

import java.util.Comparator;
import java.util.SequencedSet;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class GathererParallel {

    public static <E> Gatherer<E, ?, E> sort(Comparator<E> comparator) {
        Supplier<SequencedSet<E>> initializer = () -> new TreeSet<>(comparator);
        Gatherer.Integrator<SequencedSet<E>, E, E> integrator =
                (set, element, downstream) -> {
                    set.add(element);
                    return true;
                };
        BinaryOperator<SequencedSet<E>> combiner = (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
        BiConsumer<SequencedSet<E>, Gatherer.Downstream<? super E>> finisher =
                (set, downstream) -> {
                    if (!downstream.isRejecting()) {
                        set.stream()
                                .allMatch(downstream::push);
                    }
                };
        Gatherer<E, SequencedSet<E>, E> gatherer = Gatherer.of(initializer, integrator, combiner, finisher);
        return gatherer;
    }
    static void main() {

        Gatherer<String, ?, String> sort =
                sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        var result = Stream.of("yak", "du", "se", "cor", "panj", "wiw", "haft")
                .parallel()
                .gather(sort)
                .toList();

        IO.println("natija = " + result);
    }
}
