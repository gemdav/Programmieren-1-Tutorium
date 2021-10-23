package solutions.lesson_03_functions_classes_packages.exercises.palindrome;

/**
 * Palindrom cecker class
 * 
 * @author David Gemen
 */
public class PalindromeChecker {

    /**
     * Checks if the passed string is a palindrome
     * 
     * @param term the string to check
     * @return true if the term is a palindrome, false if not
     */
    public static boolean check(String term) {
        int len = term.length();
        for (int i = 0; i < len / 2; i++) {
            if (term.charAt(i) != term.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}