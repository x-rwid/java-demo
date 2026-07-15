package objects;
// Object
public class DemoPointRect {
    static void main() {
        /*
        1ci statement DemoPoint class'ini object'ini tuzadi va uni variable'ga tayinlab e'lan qiladi
        2-3ci statement'lar DemoRectangle class'ini object'larini tuzadi va ularni variable'larga tayinlab e'lan qiladi
         */
//        DemoPoint originOne = new DemoPoint(23, 94);
//        DemoRectangle rectOne = new DemoRectangle(originOne, 100, 200);
//        DemoRectangle rectTwo = new DemoRectangle(50, 100);

        var originOne = new DemoPoint(23, 94);
        var rectOne = new DemoRectangle(originOne, 100, 200);
        var rectTwo = new DemoRectangle(50, 100);

        // axbarotni namoyiw etiw
        IO.println("Asl: " + originOne);
        IO.println("Rectangle 1 - Kenglik: " + rectOne.width + ", Balandlik: " + rectOne.height);
        IO.println("Rectanlge 1 - Maydon: " + rectOne.getArea());

        // siljitiw va namoyiw etiw
        rectTwo.origin = originOne;
        IO.println("Rectangle 2 ni joyi: " + rectTwo.origin);

        rectTwo.move(40, 72);
        IO.println("Siljigandan keyin: " + rectTwo.origin);

        // mani objectlarim!
        var myPoint = new DemoPoint(10, 20);
        var myRect = new DemoRectangle(myPoint, 30, 40);
        IO.println("Mani 4burcak maydonim: " + myRect.getArea());

//        // rectOne'ni kengligi, balandligi va maydonini namoyiw etiw
//        IO.println("rectOne'ni kengligi: " + rectOne.width);
//        IO.println("rectTwo'ni balandligi: " + rectOne.height);
//        IO.println("rectOne'ni maydoni: " + rectOne.getArea());
//
//        // rectTwo'ni joyini o'rnatiw
//        rectTwo.origin = originOne;
//
//        // rectTwo'ni joyini namoyiw etiw
//        IO.println("rectTwo'ni X joyi: " + rectTwo.origin.x);
//        IO.println("rectTwo'ni Y joyi: " + rectTwo.origin.y);
//
//        // rectTwo'ni siljitiw va uni yangi joyini namoyiw etiw
//        rectTwo.move(40, 72);
//        IO.println("rectTwo'ni X joyi: " + rectTwo.origin.x);
//        IO.println("rectTwo'ni Y joyi: " + rectTwo.origin.y);
    }
}
