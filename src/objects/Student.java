package objects;
// Class
public class Student {

    String name;
    int age;
    String major;

    // default constructor
    public Student() {
        name = "No ma'lum";
        age = 0;
        major = "E'lan qilinmagan";
    }

    // faqat ismga ega constructor
    public Student(String studentName) {
        name = studentName;
        age = 18; // sukut bo'yica
        major = "E'lan qilinmagan";
    }

    // ism va yowga ega constructor
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
        major = "E'lan qilinmagan";
    }

    // hamma parameter'larga ega constructor
    public Student(String studentName, int studentAge, String studentMajor) {
        name = studentName;
        age = studentAge;
        major = studentMajor;
    }

    public void displayInfo() {
        IO.println("Ism: " + name + ", Yow: " + age + ", Mutaxassislik: " + major);
    }

    public void changeMajor(String newMajor) {
        major = newMajor;
        IO.println(name + " mutaxassisligini o'zgartirdi: " + newMajor);
    }
}
