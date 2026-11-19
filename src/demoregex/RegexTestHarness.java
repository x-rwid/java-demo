package demoregex;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {
    static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
            System.err.println("No console");
            System.exit(1);
        }
        while (true) {

            Pattern pattern = Pattern.compile(console.readLine("%nRegex kiritin: "));

            Matcher matcher = pattern.matcher(console.readLine("Search ucun input String kirtin: "));

            boolean found = false;
            while (matcher.find()) {
                console.format("Men index " + "%d dan start olib, index %d da end bo'ladigan" + " \"%s\" text'ini topdim.%n",
                        matcher.start(),
                        matcher.end(),
                        matcher.group());
                found = true;
            }
            if (!found) {
                console.format("Matcher topilmadi.%n");
            }
        }
    }
}
