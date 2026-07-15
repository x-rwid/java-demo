package objects;

public class ObjectDemo {

    static String name;
    static float price;

    static void set(String n, float p) {
        name = n;
        price = p;
    }
    static void get() {
        IO.println("Dastur nomi: " + name);
        IO.println("Dastur natxi: " + price);
    }

    static void main() {
        ObjectDemo.set("X Studio", 5.5f);
        ObjectDemo.get();
    }
}
