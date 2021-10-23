package solutions.lesson_03_classes_functions.showcase.fibonacci;

import solutions.lesson_03_classes_functions.showcase.fibonacci.calculator.Fibonacci;

/**
 * Fibonacci showcase main class
 * 
 * @author David Gemen
 */
public class Main {

    /**
     * Main function, programs entry pouint
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int nthFib = Fibonacci.calculate(5, true);
        System.out.println("Die 5. Fibonacci Zahl ist " + nthFib + ".");
    }
}
