package solutions.lesson_04_object_orientation.exercises.circle;

/**
 * Circle class
 * 
 * @author David Gemen
 */
public class Circle {

    // Attributes
    private double radius;

    // Class variables
    private static double radiusSum = 0.0;
    private static int circleAmount = 0;
    private static final double PI = Math.PI;

    // Constructors
    /**
     * Constructor for circle class
     * 
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
        radiusSum += radius;
        circleAmount++;
    }

    // Methods
    /**
     * Calculates the circumference of the circle
     * 
     * @return the circumference
     */
    public double circumference() {
        return 2 * PI * radius;
    }

    /**
     * Calculates the area of the circle
     * 
     * @return the area
     */
    public double area() {
        return PI * radius * radius;
    }

    /**
     * Checks if this circle is bigger than the passed one
     * 
     * @param other the circle to compare this with
     * @return true if this circle is bigger, false if not
     */
    public boolean isBiggerThan(Circle other) {
        return this.radius > other.radius;
    }

    // Functions
    /**
     * Returns the average radius of all circles that were created
     * 
     * @return the average radius
     */
    public static double averageRadius() {
        return radiusSum / circleAmount;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        radiusSum += radius - this.radius;
        this.radius = radius;
    }
}
