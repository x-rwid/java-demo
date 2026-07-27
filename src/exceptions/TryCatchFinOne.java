package exceptions;

import java.util.ArrayList;
import java.util.List;

public class TryCatchFinOne {
    static void main() {
        // 1-Namuna

        List<String> items = new ArrayList<>();
        items.add("birinci");
        items.add("ikkinci");

        try {
            IO.println("Try Block'da - yaroqli index'ga kiriw: " + items.get(0));
            IO.println("Try Block'da - yaroqsiz index'ga kiriw: " + items.get(10));
            IO.println("Istisna bu block ijrosini to'xtatdi.");
        } catch (IndexOutOfBoundsException e) {
            IO.println("Exception: " + e);
        } finally {
            IO.println("Finally Block doim ijro etiladi.");
        }
        IO.println("Dastur tabiiy davom etadi.");
    }
}
