package methods;

public class AnimalCat extends Animal {
// Animal superclass'ni Cat subclass'i

    //public class Cat extends Animal {
    public static void testClassMethod() {
        IO.println("Cat'da static method");
    }

    public void testInstanceMethod() {
        IO.println("Cat'da instance method");
    }

    static void main() {

        AnimalCat myCat = new AnimalCat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();

        myAnimal.testInstanceMethod();
    }
}

