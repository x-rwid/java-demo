package demoregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {

    private static final String REGEX =
            "\\bdog\\b";
    private static final String INPUT =
            "dog dog dog doggie dogg";

    static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // matcher'ni object'ini oliw
        Matcher m = p.matcher(INPUT);
        int count = 0;
        while (m.find()) {
            count++;
            IO.println("Match number "
                    + count);
            IO.println("start(): "
                    + m.start());
            IO.println("end(): "
                    + m.end());
        }
    }
}

