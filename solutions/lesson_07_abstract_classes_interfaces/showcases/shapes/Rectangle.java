package solutions.lesson_07_abstract_classes_interfaces.showcases.shapes;

/**
 * Rectangle class for showcase
 * 
 * @author David Gemen
 */
public class Rectangle extends Shape implements Turnable, Divisible {

    private double width;
    private double height;

    /**
     * Constructor of this class
     * 
     * @param x      the x coord of the position
     * @param y      the y coord of the position
     * @param width  the width of the rect
     * @param height the height of the rect
     */
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void divide(int divisor) {
        this.height /= divisor;
    }

    @Override
    public void turn() {
        double tmp = height;
        height = width;
        width = tmp;
        print("Nice Turn");
    }
}
