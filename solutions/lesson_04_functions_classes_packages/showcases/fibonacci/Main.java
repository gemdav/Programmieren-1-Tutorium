package solutions.lesson_04_functions_classes_packages.showcases.fibonacci;

import solutions.lesson_04_functions_classes_packages.showcases.fibonacci.calculator.Fibonacci;

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
