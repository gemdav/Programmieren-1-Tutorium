package solutions.lesson_05_object_orientation.exercises.circle;

/**
 * Main class for Circle class
 * 
 * @author David Gemen
 */
public class Main {

    /**
     * Main function, program starts here
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Test functionality
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(3.0);
        System.out.println(c1.getRadius()); // expected: 1.0
        System.out.println(Circle.averageRadius()); // expected: 2.0
        c1.setRadius(2.0);
        System.out.println(c1.getRadius()); // expected: 2.0
        System.out.println(Circle.averageRadius()); // expected: 2.5
        System.out.println(c1.isBiggerThan(c2)); // expected: false
        System.out.println(c1.circumference()); // expected: 12.566370614359172
        System.out.println(c1.area()); // expected: 12.566370614359172
    }

}
