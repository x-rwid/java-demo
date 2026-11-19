package demoregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesLooking {

    private static final String REGEX = "foo";
    private static final String INPUT =
            "fooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;

    static void main(String[] args) {

        // iwga tuwiriw
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        IO.println("Joriy REGEX: "
                + REGEX);
        IO.println("Joriy INPUT: "
                + INPUT);

        IO.println("lookingAt(): "
                + matcher.lookingAt());
        IO.println("matches(): "
                + matcher.matches());
    }
}
