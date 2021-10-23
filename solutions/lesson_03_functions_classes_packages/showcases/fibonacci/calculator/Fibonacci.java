package solutions.lesson_03_functions_classes_packages.showcases.fibonacci.calculator;

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
            printNumber(0, first);
            printNumber(1, second);
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
                printNumber(i, second);
            }
        }

        return second;
    }

    /**
     * This function does nothing and is only visible within this class
     */
    private static void printNumber(int index, int number) {
        System.out.println(index + ": " + number);
    }
}
