package objects;

public class BikeRoad extends Bicycle {

    // millimeter'larda (MM)
    private int tireWidth;

    public BikeRoad(int startCadence,
                    int startGear,
                    int startSpeed,
                    int newTireWidth) {
        super(startCadence,
                startGear,
                startSpeed);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth() {
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth) {
        this.tireWidth = newTireWidth;
    }

    public void printDescription() {
        super.printDescription();
        IO.println("RoadBike " + getTireWidth() + " MM wina'larga ega.");
    }
}
