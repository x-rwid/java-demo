package demostreamapis;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleDemo {
    static void main() {

        List<Vehicle> vehicles = List.of(
                new VehicleCar(VehicleColor.BLACK, VehicleEngine.ELECTRIC, VehicleDrive.WD2, 4),
                new VehicleCar(VehicleColor.RED, VehicleEngine.HYBRID, VehicleDrive.WD4, 5),
                new VehicleTruck(VehicleEngine.GAS, VehicleDrive.WD4, 12_000),
                new VehicleTruck(VehicleEngine.GAS, VehicleDrive.WD2, 8_000)
        );

        List<Vehicle> electricVehicles =
                vehicles.stream()
                        .collect(
                                Collectors.teeing(
                                        Collectors.filtering(vehicle -> vehicle
                                                instanceof VehicleCar car && car.engine() == VehicleEngine.ELECTRIC,
                                                Collectors.toList()), Collectors.filtering(vehicle -> vehicle
                                                instanceof VehicleTruck truck && truck.engine() == VehicleEngine.ELECTRIC,
                                                Collectors.toList()), (cars, trucks) -> {
                                            cars.addAll(trucks);
                                            return cars;
                                        }));
        IO.println("Electric Vehicle'lar: " + electricVehicles);
    }
}
