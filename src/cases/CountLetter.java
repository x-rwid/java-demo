package cases;

public class CountLetter {
    static void main() {
        // continue (unlabel) - Harfni Sanaw Dasturi

        String searchMe = "qiwda kiwmiw piwmasmiw, piwsa kiwmiw qiwmasmiw";
        int max = searchMe.length();
        int numWs = 0;

        for (int i = 0; i < max; i++) {
            // faqat w larga qiziqaman
            if (searchMe.charAt(i) != 'w')
                continue;

                // p lar jaroyani
                numWs++;
            }
        IO.println("Qatorda " + numWs + " ta w topildi.");
    }
}
