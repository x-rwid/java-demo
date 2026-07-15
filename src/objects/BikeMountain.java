package objects;

public class BikeMountain extends Bicycle {
    private String suspension;

    public BikeMountain(
                        int startCadence,
                        int startGear,
                        int startSpeed,
                        String suspensionType) {
        super(startCadence,
                startGear,
                startSpeed);
        this.setSuspension(suspensionType);
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        IO.println("MountainBike " + getSuspension() + " osma tizmga ega.");
    }
}
