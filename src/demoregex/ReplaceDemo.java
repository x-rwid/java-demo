package demoregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo {

    private static String REGEX = "kucuk";
    private static String INPUT =
            "kucuk meov deydi, hamma kucuklar meov deydi.";
    private static String REPLACE = "muwuk";

    static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);
        // matcher'ni object'ini oliw
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        IO.println(INPUT);
    }
}
