package demoregex;

import java.util.regex.Pattern;

public class SplitDemo2 {

    private static final String REGEX = "\\d";
    private static final String INPUT = "yak9du4se7cor1panj";

    static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);
        String[] items = p.split(INPUT);
        for (String s : items) {
            IO.println(s);
        }
    }
}
