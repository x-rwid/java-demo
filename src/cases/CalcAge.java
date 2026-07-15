package cases;

public class CalcAge {
    static void main() {
        // Yowni Hisablaw Dasturi

        // Test 1
        int birthYear1 = 1967;
        int birthMonth1 = 10;
        int birthDay1 = 26;
        int currentYear1 = 2026;
        int currentMonth1 = 4;
        int currentDay1 = 11;
        calculateAndPrintAge(birthYear1, birthMonth1, birthDay1, currentYear1, currentMonth1, currentDay1);

        // Test 2
        int birthYear2 = 1969;
        int birthMonth2 = 4;
        int birthDay2 = 29;
        int currentYear2 = 2026;
        int currentMonth2 = 4;
        int currentDay2 = 11;
        calculateAndPrintAge(birthYear2, birthMonth2, birthDay2, currentYear2, currentMonth2, currentDay2);
    }
    public static void calculateAndPrintAge(int birthYear, int birthMonth, int birthDay,
                                            int currentYear, int currentMonth, int currentDay) {

        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;

        // agar salbiy bo'lsa, oy va kunlarni moslawtiriw
        if (days < 0) {
            months--; // oylarni kamayiwi
            days += 30; // kamaygan oy ucun 30 kun qo'wiw
        }
        if (months < 0) {
            years--; // yillarni kamayiwi
            months += 12; // kamaygan yil ucun 12 kun qo'wiw
        }
        IO.println("Tavallad sana: " + birthYear + "-" + String.format("%02d", birthMonth) + "-" + String.format("%02d",birthDay)
        + ", Joriy sana: " + currentYear + "-" + String.format("%02d", currentMonth) + "-" + String.format("%02d", currentDay));
        IO.println("Yow: " + years + " yil " + months + " oy " + days + " kun\n");
    }
}
