package objects;

public class Count {

    static int count = 0;

    public Count() {
        count++;
        IO.println(count);
    }
}
