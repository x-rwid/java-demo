package statements;

public class BreakContinue {
    static void main() {
        // break

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            IO.println(i);
        }

        // continue - label
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    continue out;
                }
                IO.println(i + " " + j);
            }
        }

        // yield
//    enum Day {
//        MONDAY, TUESDAY, WEDNESDAY,
//        THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//
//    public int calculateDay(Day day) {
//        return switch (day) {
//            case SATURDAY, SUNDAY -> 0;
//            default -> {
//                int remainingWorkDays = 5 - day.ordinal();
//                yield remainingWorkDays;
//            }
//        };
    }
}


