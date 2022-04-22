/**
 * Fibnacci recursive calculator class
 * 
 * @author David Gemen
 */
public class Fibonacci {

    /**
     * Main function, program starts here
     * 
     * @param args command line arguments
     */
    public static void main(String args[]) {
        int n = 9;
        System.out.println(fibonacci(n));
    }

    /**
     * Calculates the nth fibonacci number recursively
     * 
     * @param n the index of the fibonacci number to calculate
     * @return the fibonacci number
     */
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
