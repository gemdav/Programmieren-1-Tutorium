package solutions.lesson_06_abstract_classes_interfaces.showcases.shapes;

/**
 * Turnable interface for the showcase
 * 
 * @author David Gemen
 */
public interface Turnable {

    /**
     * Should turn something around
     */
    public void turn();

    /**
     * Prints that something was a nice turn
     */
    public default void print(String toPrint) {
        System.out.println(toPrint);
    }
}
