package objects;
// Object
public class StudentDemo {
    static void main() {

        // turli constructor'lardan foydalaniw
        var student1 = new Student(); // default constructor
        var student2 = new Student("Alice"); // faqat ism
        var student3 = new Student("Ya'qub", 20); // ism va yow
        var student4 = new Student("Xurwid", 21, "Dasturlaw"); // hamma parameter'lar

        // hamma talabalarni namoyiw etiw
        IO.println("===Talabalar Ma'lumatnamasi===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();

        // object'larni o'zgartiriw
        IO.println("\n===O'zgariwlardan Keyin===");
        student2.changeMajor("Riyaziyat");
        student3.changeMajor("Tabiat");
    }
}
