package cases;

public enum Planet {

    // sayyarolar, mass, radius
    MERCURY(3.303E+23, 2.4397E6),
    VENUS(4.869E+24, 6.0518E6),
    EARTH(5.976E+24, 6.37814E6),
    MARS(6.421E+23, 3.3972E6),
    JUPITER(1.9E+27, 7.1492E7),
    SATURN(5.688E+26, 6.0268E7),
    URANUS(8.686E+25, 2.5559E7),
    NEPTUNE(1.024E+26, 2.4746E7);

    public static final double G = 6.67300E-11;

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    private double mass() {
        return mass;
    }
    private double radius() {
        return radius;
    }
    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }

    static void main(String[] args) {

        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / EARTH.surfaceGravity();
        for (Planet p: Planet.values()) {
            System.out.printf("%s dagi vazniz %f%n",
                    p, p.surfaceWeight(mass));
        }
    }
}
