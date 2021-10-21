package solutions.lesson_02_loops_and_functions.exercises;

/**
 * Palindrom cecker class
 * 
 * @author David Gemen
 */
public class PalindromeChecker {

    /**
     * main function, program starts here.
     * 
     * @param args command line arguments, all arguments taken as String.
     */
    public static void main(String[] args) {

        String term = args[0];
        term = term.toLowerCase(); // optional

        // detect palindrome
        boolean palindrome = true;
        int len = term.length();
        for (int i = 0; i < len / 2; i++) {
            if (term.charAt(i) != term.charAt(len - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Der String ist ein Palindrom");
        } else {
            System.out.println("Der String ist kein Palindrom");
        }
    }
}