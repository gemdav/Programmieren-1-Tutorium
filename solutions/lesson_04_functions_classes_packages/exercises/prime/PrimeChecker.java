package prime;

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
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
