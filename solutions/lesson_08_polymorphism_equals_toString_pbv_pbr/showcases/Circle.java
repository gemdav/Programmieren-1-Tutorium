package solutions.lesson_08_polymorphism_equals_toString_pbv_pbr.showcases;

/**
 * Circle class
 * 
 * @author David Gemen
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        return this.radius == other.radius;
    }

    /**
     * Main function, program starts here
     * 
     * @param args command line args
     */
    public static void main(String[] args) {

        // equals showcase

        Circle c1 = new Circle(1.0);
        Circle c2 = c1;
        Circle c3 = new Circle(1.0);
        System.out.println(c1 == c2); // expected: true
        System.out.println(c1 == c3); // expected: false
        System.out.println(c1.equals(c3)); // expected: true if equals method was correctly overridden

        // toString showcase

        Circle circle = new Circle(5.0);
        System.out.println(circle); // expected: Circle [radius=5.0]
        System.out.println(circle.toString()); // expected: Circle [radius=5.0]
    }

}
