package demostreamapis;

import java.util.List;
import java.util.stream.Stream;

public class StreamBuilder {
    static void main() {

        Stream.Builder<String> builder = Stream.<String>builder();
        builder.add("yak")
                .add("du")
                .add("se")
                .add("cor");
        Stream<String> stream = builder.build();

        List<String> list = stream.toList();
        IO.println("list = " + list);
    }
}
