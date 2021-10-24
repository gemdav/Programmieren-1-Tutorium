package solutions.lesson_06_abstract_classes_interfaces.showcases.shapes;

/**
 * Circle showcase class
 * 
 * @author David Gemen
 */
public class Circle extends Shape {

    private double radius;

    /**
     * Constructor of this class
     * 
     * @param x      x coord of the position of the shape
     * @param y      y coord of the position of the shape
     * @param radius the radius of the circle
     */
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
