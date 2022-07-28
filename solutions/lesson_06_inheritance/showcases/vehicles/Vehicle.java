/**
 * Vehicle class
 * 
 * @author David Gemen
 */
public class Vehicle {

    // Attributes of the Vehicle
    private double x;
    private double y;
    private String color;

    /**
     * Constructor of this class
     * 
     * @param x     the latitude of the vehicle
     * @param y     the longitude of the vehicle
     * @param color the color of the vehicle
     */
    public Vehicle(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Methods of the vehicle
    /**
     * Calculates the distance between this and another vehicle
     * 
     * @param other the other vehicle
     * @return the distance
     */
    public double distanceTo(Vehicle other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
