package methods;

public class Dev extends Developer implements DevMaster, DevJava {
    public static void main(String... args) {
        Dev myApp = new Dev();

        IO.println(myApp.identifyMyself());
    }
}
