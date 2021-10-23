package solutions.lesson_05_inheritance.showcases.vehicle;

public class Plane extends Vehicle {

    // Attributes of the Plane
    private double altitude;
    private String airline;

    /**
     * Constructor of this class
     * 
     * @param x        the x coordinate position
     * @param y        the y coordinate position
     * @param color    the color of this plane
     * @param altitude the maximum altitude of this plane
     * @param airline  the airline this plane belongs to
     */
    public Plane(double x, double y, String color, double maxAltitude, String airline) {
        super(x, y, color);
        this.altitude = maxAltitude;
        this.airline = airline;
    }

    // Methods of the plane
    /**
     * Makes a print to the console with some cabin crew speech stuff
     */
    public void cabinCrewSpeech() {
        System.out.println("This is airline " + airline + ". We are now at " + altitude + " altitude");
    }

    @Override
    public double distanceTo(Vehicle other) {
        double otherAlt = other instanceof Plane ? ((Plane) other).altitude : 0;
        return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2)
                + Math.pow(this.altitude - otherAlt, 2));
    }

    // Getters and Setters
    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
