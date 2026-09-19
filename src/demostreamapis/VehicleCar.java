package demostreamapis;

import java.awt.*;

public record VehicleCar(VehicleColor color, VehicleEngine engine, VehicleDrive drive, int passengers) implements Vehicle {}
