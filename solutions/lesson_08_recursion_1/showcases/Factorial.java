package solutions.lesson_08_recursion_1.showcases;

/**
 * Factorial calculator
 * 
 * @author David Gemen
 */
public class Factorial {

    /**
     * Main function, program starts here
     * 
     * @param args command line args
     */
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeFactorial(5));
    }

    /**
     * calculates the factorial of n recursively
     * 
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     */
    private static int recursiveFactorial(int n) {
        if (n < 0) {
            System.out.println("undefiniert");
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    /**
     * calculates the factorial of n iteratively
     * 
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     */
    private static int iterativeFactorial(int n) {
        if (n < 0) {
            System.out.println("undefiniert");
            return 0;
        }
        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}