package solutions.lesson_10_exceptions.exercises;

/**
 * Custom Exception Class
 * 
 * @author David Gemen
 */
public class LolException extends Exception {

    /**
     * create new Exception
     * 
     * @param message message for cmd line output
     */
    public LolException(String message) {
        super(message);
    }
}
