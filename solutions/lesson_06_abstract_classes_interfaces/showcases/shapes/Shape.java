package solutions.lesson_06_abstract_classes_interfaces.showcases.shapes;

/**
 * Abstract Shape class for showcase
 * 
 * @author David Gemen
 */
public abstract class Shape {

    private double x;
    private double y;

    /**
     * Constructor of this class
     * 
     * @param x the x coord of the position
     * @param y the y coord of the position
     */
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the area of the shape
     * 
     * @return the area of the shape
     */
    public abstract double area();

    /**
     * Checks if this shape is bigger than another on
     * 
     * @param other the shape to compare this to
     * @return true if this one has a bigger area, false if not
     */
    public boolean isBiggerThan(Shape other) {
        return this.area() > other.area();
    }

    /**
     * Moves the shape to the passed coords
     * 
     * @param x the x coord to move the shape to
     * @param y the y coord to move the shape to
     */
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for the x coord
     * 
     * @return the x coord
     */
    public double getX() {
        return x;
    }

    /**
     * Getter for the y coord
     * 
     * @return the y coord
     */
    public double getY() {
        return y;
    }
}