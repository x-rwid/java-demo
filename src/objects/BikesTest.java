package objects;

public class BikesTest {
    static void main() {

        Bicycle bike01, bike02, bike03;

        bike01 = new Bicycle(20, 1, 10);
        bike02 = new BikeMountain(20, 5, 10, "ikki tomonlama");
        bike03 = new BikeRoad(40, 8, 20, 23);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();
    }
}
