package demostreamapis;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamRegEx {
    static void main() {

        String sentence = "Cunki hali ewitiladigan yaxwi xabarlar va ko'rinadigan yaxwi narsalar bor.";

        Pattern pattern = Pattern.compile(" ");
        Stream<String> stream = pattern.splitAsStream( sentence );
        List<String> words = stream.toList();
        IO.println("So'zlar: " + words);
    }
}
