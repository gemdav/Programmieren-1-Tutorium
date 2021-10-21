package solutions.lesson_02_loops_and_functions.exercises;

/**
 * Class to check whether s number is a prime number.
 * 
 * @author David Gemen
 */
public class PrimeChecker {

    /**
     * main function, program starts here.
     * 
     * @param args command line arguments, first argument taken as number
     */
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        // check prime
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            System.out.println("Die Zahl ist eine Primzahl");
        } else {
            System.out.println("Die Zahl ist keine Primzahl");
        }
    }
}
