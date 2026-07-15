package classes;

public class LocalClass {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength) formattedPhoneNumber = currentNumber;
                    else
                        formattedPhoneNumber = null;
                }
                public String getNumber() {
                return formattedPhoneNumber;
            }
        }
        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        if (myNumber1.getNumber() == null)
            IO.println("1ci raqam xato");
        else
            IO.println("1ci raqam bu "  + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            IO.println("2ci raqam xato");
        else
            IO.println("2ci raqam bu " + myNumber2.getNumber());
    }
    static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
