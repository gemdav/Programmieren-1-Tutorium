package solutions.lesson_03_functions_classes_packages.exercises.prime;

/**
 * Class to check whether s number is a prime number.
 * 
 * @author David Gemen
 */
public class PrimeChecker {

    /**
     * Checks if the passed int is a prime
     * 
     * @param number the number to check
     * @return true if the number is a prime, false if not
     */
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
