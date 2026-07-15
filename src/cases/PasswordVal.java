package cases;

import java.util.Scanner;

public class PasswordVal {
    // Kalitso'zni Tasdiqlovci Dastur

    public static boolean checkPassword(String password) {

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasCharacter = false;

        String specialChars = ".,!?:;'`<>()[]{}+-/*=%^~_&|#$@";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialChars.indexOf(ch) != -1) {
                hasCharacter = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasCharacter;
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        IO.print("Kalitso'zni kiritin: ");
        String password = scan.nextLine();

        boolean isValid = checkPassword(password);
        IO.println(isValid);

        scan.close();
    }
}
