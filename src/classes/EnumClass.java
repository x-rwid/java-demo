package classes;

import java.time.DayOfWeek;

public class EnumClass {
    static void main() {

        DayOfWeek someDay = DayOfWeek.THURSDAY;

        switch (someDay) {
            case SUNDAY -> IO.println("Hafta bowlangan.");
            case MONDAY, TUESDAY, WEDNESDAY -> IO.println("Biz haftani o'rtasidamiz.");
            case THURSDAY -> IO.println("Haftani oxiri yaqin.");
            case FRIDAY, SATURDAY -> IO.println("Haftani oxiri.");
            default -> throw new AssertionError("Bu sodir bo'lmadi.");
        }

        DayOfWeek someDay2 = DayOfWeek.FRIDAY;

        String text = switch (someDay2) {
            case SUNDAY -> "Hafta bowlangan.";
            case MONDAY, TUESDAY, WEDNESDAY -> "Biz haftani o'rtasidamiz.";
            case THURSDAY -> "Haftani oxiri yaqin.";
            case FRIDAY, SATURDAY -> "Haftani oxiri.";
        };
        IO.println(text);
    }
}
