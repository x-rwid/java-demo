package demoregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo2 {

    private static String REGEX = "a*b";
    private static String INPUT =
            "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);
        // matcher'ni object'ini oliw
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        IO.println(INPUT);
    }
}
