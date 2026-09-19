package demostreamapis;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
    static void main() {

        Map<Integer, Optional<String>> map =
                Map.of(
                        1, Optional.empty(),
                        2, Optional.of("du"),
                        3, Optional.empty(),
                        4, Optional.of("cor")
                );
        IO.println("Map 1");
        map.forEach((key, value) -> IO.println(key + ": " + value));

        Map<Integer, String> map2 = map.entrySet().stream()
                        .flatMap(entry -> entry.getValue()
                        .map(value -> Map.entry(entry.getKey(), value)).stream())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        IO.println("Map 2");
        map2.forEach((key, value) -> IO.println(key + ": " + value));
    }
}
