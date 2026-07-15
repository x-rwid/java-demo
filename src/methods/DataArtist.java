package methods;

public class DataArtist {
    // Method'larni Ortiqca Yuklaniwi

    public void draw(String s) {
        IO.println("method 1 " + s);
    }

    public void draw(int i) {
        IO.println("method 2 - " + i);
    }

    public void draw(double d) {
        IO.println("method 3 - " + d);
    }

    public void draw(int i, double d) {
        IO.println("method 4 - " + i + " " + d);
    }

    public int add(int a, int b) {
        IO.println("method 5 - " + a + " " + b);
        return a + b;
    }

    public double add(double a, double b) {
        IO.println("method 6 - " + a + " " + b);
        return a + b;
    }

    static void main() {
        DataArtist dataArtist = new DataArtist();

        dataArtist.draw("");
        dataArtist.draw(4);
        dataArtist.draw(2.0);
        dataArtist.draw(1, 1.5);

        dataArtist.add(4, 5);
        dataArtist.add(1.2, 5.7);
    }
}
