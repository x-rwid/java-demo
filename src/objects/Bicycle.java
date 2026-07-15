package objects;

public class Bicycle {
    // Superclass

    // 3 ta field
    public int cadence;
    public int gear;
    public int speed;

    // 1 ta constructor
    public Bicycle(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }
    // 4 ta method
    public void setCadence(int newValue) {
        cadence = newValue;
    }
    public void setGear(int newValue) {
        gear = newValue;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void printDescription() {
        IO.println("\nBike " + this.gear + " uzatgicda "
                + this.cadence + " cadence ila va "
                + this.speed + " tezlikda sayr qilyapdi.");
    }
}
