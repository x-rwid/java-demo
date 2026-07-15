package objects;
// Class
public class DemoRectangle {

    int width = 0;
    int height = 0;
    DemoPoint origin;

    // 4 ta constructor
    public DemoRectangle() {
        origin = new DemoPoint(0, 0);
    }
    public DemoRectangle(DemoPoint p) {
        origin = p;
    }
    public DemoRectangle(int w, int h) {
        origin = new DemoPoint(0, 0);
        width = w;
        height = h;
    }
    public DemoRectangle(DemoPoint p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }
    // rectangle'ni siljitiw ucun method
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }
    // to'rtburcakni maydonini hisablaw ucun method
    public int getArea() {
        return width * height;
    }
}
