package solutions.lesson_03_classes_functions.showcase.fibonacci.calculator;

/**
 * Fibonacci showcase class
 * 
 * @author David Gemen
 */
public class Fibonacci {

    /**
     * Calculates the nth fibonacci number and optionally prints all numbers on its
     * way
     * 
     * @param n          the index of the wanted fibonacci number
     * @param printUntil true if the numbers on the way should be printed
     * @return the nth fibonacci nuumber
     */
    public static int calculate(int n, boolean printUntil) {

        int first = 0;
        int second = 1;
        if (printUntil) {
            System.out.println("0: " + first);
            System.out.println("1: " + second);
        }
        if (n == 0) {
            return first;
        }
        // calculate fibonacci
        for (int i = 2; i <= n; i++) {
            int tmp = first;
            first = second;
            second = tmp + second;
            if (printUntil) {
                System.out.println(i + ": " + second);
            }
        }

        return second;
    }
}
