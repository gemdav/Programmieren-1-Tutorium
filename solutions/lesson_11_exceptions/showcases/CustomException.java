package solutions.lesson_11_exceptions.showcases;

/**
 * My Custom Exception class
 * 
 * @author David Gemen
 */
public class CustomException extends Exception {

    /**
     * Constructor that passes message to Exception class
     * 
     * @param msg the exception message
     */
    public CustomException(String msg) {
        super(msg);
    }
}
