package demodatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class ParseDemo {
    static void main() {

        String input = "Nov 9 2026";

        try {
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("MMM d yyyy", Locale.US);

            LocalDate date = LocalDate.parse(input, formatter);
            System.out.printf("%s%n", date);

        } catch (DateTimeParseException exc) {
            System.out.printf("%s ni tahlillab bo'lmaydi!%n", input);
            throw exc;      // exception'ni qayta otiw
        }

        // date muvaffaqiyatli tahlillandi
    }
}
