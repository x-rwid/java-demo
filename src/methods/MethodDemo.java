package methods;

public class MethodDemo {
    static void main() {
        // Method

        MethodDemo methodDemo = new MethodDemo();
        methodDemo.getMessage("Method.");
        IO.println(methodDemo.getSum(3,4));
    }
    public void getMessage(String message) {
        IO.println("Hey, bu function " + message);
    }
    public int getSum(int a, int b) {
        return a + b;
    }
}
