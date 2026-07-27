package exceptions;

import java.util.ArrayList;
import java.util.List;

public class TryCatchFinTwo {
    static void main() {
        // 2-Namuna

        List<String> items = new ArrayList<>();
        items.add("birinci");
        items.add("ikkinci");

        try {
            IO.println("Try Block'da - yaroqli index'ga kiriw: " + items.get(0));
            IO.println("Bu code block'da hec qanday istisna otilmaydi.");
        } catch (IndexOutOfBoundsException e) {
            IO.println("Exception: " + e);
        } finally {
            IO.println("Finally Block doim ijro etiladi, hatto istisna tutilmasa ham.");
        }
        IO.println("Dastur tabiiy davom etadi.");
    }
}
