package cases;

public class SearchWord {
    static void main() {
        // continue (label) - So'zni Izlaw Dasturi

        String searchMe = "Mandan substring'ni izlan.";
        String substring = "sub";
        boolean foundIt1 = false;

        int max = searchMe.length() -  substring.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt1 = true;
            break test;
        }
        IO.println(foundIt1 ? "U topildi." : "U topilmadi.");
    }
}
