package variables;

public class InstanceVar {
    // Instance Variable (No Static Field)

    public String geek;
    public int i;
    public Integer I;

    public InstanceVar() {
        // default constructor, no static field'ni iwga tuwiriw
        this.geek = "Java";
    }

    public static void main(String[] args) { // main method
        InstanceVar name = new InstanceVar(); // object tuziw

        // O/P'ni namoyiwi
        IO.println("Geek nom bu " + name.geek);
        IO.println("int ucun sukut bo'yica qiymat bu " + name.i);
        // toString() icki raviwda caqiriladi
        IO.println("Integer ucun sukut bo'yica qiymat bu " + name.I);
    }
}

