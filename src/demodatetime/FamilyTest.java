package demodatetime;

import java.time.LocalDate;

public class FamilyTest {
    static void main() {

        int year = 2027;
        int month = 4;
        int day = 29;

        // yil, oy, kunni belgilaw
        LocalDate date = LocalDate.of(year, month, day);

        // lambda expression yordamisiz query'ni invoke qiliw
        Boolean isFamilyVacation = date.query(new FamilyVacations());

        // lambda expression yordamida query'ni invoke qiliw
        Boolean isFamilyBirthday = date.query(FamilyBirthdays::isFamilyBirthday);

        if (isFamilyVacation.booleanValue() || isFamilyBirthday.booleanValue())
            System.out.printf("%s muhim sana!%n", date);
        else
            System.out.printf("%s muhim sana emas.%n", date);
    }
}
