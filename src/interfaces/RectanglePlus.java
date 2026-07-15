package interfaces;

import java.awt.*;

public class RectanglePlus implements Relatable {

    public  int width = 0;
    public int height = 0;
    public Point origin;

    // 4 ta constructor
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // to'rtburcakni siljitiw method'i
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // to'rtburcakni maydonini hisablaw method'i
    public int getArea() {
        return width * height;
    }

    // Relatable interface'ini tatbiq etiw ucun zarur bo'lgan method
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus) other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }
}
