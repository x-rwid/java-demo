package strings;

public class StrConcat {
    static void main() {
        // String'larni birlawtiriw

        String speciality = "Java";
        String field = "Developer";
        String occupation = speciality + " " + field;
        IO.println("Kasb: " + occupation);

        // concat() method'dan foydalaniw
        String greeting = "Salam,".concat(occupation).concat("!");
        IO.println(greeting);

        // turli xil turlarni aralawtiriw
        int age = 36;
        String info = "Man " + age + " yowdaman.";
        IO.println(info);
    }
}
