package solutions.lesson_05_inheritance.showcases.vehicle;

public class Vehicle {

    // Attributes of the Vehicle
    private double x;
    private double y;
    private String color;

    /**
     * Constructor of this class
     * 
     * @param tireAmount        the amount of tires this vehicle has
     * @param color             the color of the vehicle
     * @param passengerCapacity the amount of passengers the vehicle can carry
     */
    public Vehicle(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * Calculates the distance between this and another vehicle
     * 
     * @param other the other vehicle
     * @return the distance in kilometers
     */
    // Methods of the vehicle
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
