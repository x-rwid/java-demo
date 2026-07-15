package strings;

public class StringDemo {

    static String txt;
    static void main() {

        IO.println(txt); // String'ni sukut bo'yica qiymati null'ga teng

        // Srting Class'ini Object'ini Tuziw
        String text = "Tic Tac"; // 1ci usul
        IO.println(text);
        IO.println(text.length()); // length method'i orqali String uzunligini aniqlaw

        String text1 = new String("Java"); // 2ci usul
        IO.println(text1);

        String str = "";
        IO.println(str.length());

        // upperCase() va lowerCase() method'lar
        String upperCase = text.toUpperCase(); // katta harflarga aylantiriw
        IO.println(upperCase);
        String lowerCase = text.toLowerCase(); // kicik harflarga aylantiriw
        IO.println(lowerCase);

        // replace() method
        String replace = text.replace("Tic Tac", "Tuk Tuk"); // almawtiriw
        IO.println(replace);

        // concat() method
        String concat = text.concat(" ").concat(text1); // xabarlarni bir biriga qo'wiw
        IO.println(concat);

        // String Concatenation Operator
        String concat1 = text1 +" "+ text; // xabarlarni bir biriga qo'wiw, qo'wtirnoqlar bo'w joy ucun
        IO.println(concat1);

        String concat2 = "Daroja " + 10 +" "+ true; // qo'wtirniqli xabar ila
        IO.println(concat2);
        String concat3 = "" + 10 +" "+ true; // xabarlarsiz qo'wtirnoqni o'zi ila
        IO.println(concat3);

        // equals() method
        IO.println(concat1.equals(concat)); // taqqoslaw
    }
}
