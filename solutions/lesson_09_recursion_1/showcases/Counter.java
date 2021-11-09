package solutions.lesson_09_recursion_1.showcases;

/**
 * Counter class.
 * 
 * @author David Gemen
 */
public class Counter {

    /**
     * Main method, program starts here
     * 
     * @param args cmd line arguments
     */
    public static void main(String[] args) {
        down(10);
        System.out.println();
        up(10);
        System.out.println();
    }

    /**
     * Prints numbers from n to 1 downwards
     * 
     * @param n maximum number
     */
    public static void down(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + ", ");
        down(n - 1);
    }

    /**
     * Prints numbers from from n to 1 upwards
     * 
     * @param n maximum number
     */
    public static void up(int n) {
        if (n < 0) {
            return;
        }
        up(n - 1);
        System.out.print(n + ", ");
    }
}