package solutions.lesson_06_abstract_classes_interfaces.showcases.shapes;

/**
 * Polygon showcase class
 * 
 * @author David Gemen
 */
public abstract class Polygon extends Shape {

    /**
     * Constructor of this class
     * 
     * @param x x coord of the position of the shape
     * @param y y coord of the position of the shape
     */
    public Polygon(double x, double y) {
        super(x, y);
    }

}
