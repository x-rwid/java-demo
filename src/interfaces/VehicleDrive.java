package interfaces;

public class VehicleDrive {
    static void main() {

        VehicleCar car = new VehicleCar();
        // default method'ni caqiradi, bu o'z navbatida private method'ni caqiradi
        car.drive();
    }
}
