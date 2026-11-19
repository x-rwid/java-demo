package demoregex;

import java.util.regex.Pattern;

public class SplitDemo {

    private static final String REGEX = ":";
    private static final String INPUT = "yak:du:se:cor:panj";

    static void main(String[] args) {

        Pattern p =  Pattern.compile(REGEX);
        String[] items = p.split(INPUT);
        for (String s : items) {
            IO.println(s);
        }
    }
}
