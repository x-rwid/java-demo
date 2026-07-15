package classes;

public class AnonymousClass {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
    public void sayHello() {

        class MuslimGreeting implements HelloWorld {
            String name = "Dunya";
            public void greet() {
                greetSomeone("Dunya");
            }
            public void greetSomeone(String someone) {
                name = someone;
                IO.println("Salam, " + name);
            }
        }
        HelloWorld muslimGreeting = new MuslimGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                IO.println("Salut " + name);
            }
        };
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "Mundo";
            public void greet() {
                greetSomeone("Mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                IO.println("Hola, " + name);
            }
        };
        muslimGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
    public static void main(String... args) {
        AnonymousClass myApp = new AnonymousClass();
        myApp.sayHello();
    }
}
