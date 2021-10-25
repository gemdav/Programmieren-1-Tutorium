package solutions.lesson_10_exceptions.showcases;

/**
 * Exceptions showcase class
 */
public class Exceptions {

    /**
     * Main function, program starts here
     * 
     * @param args
     */
    public static void main(String[] args) throws CustomException {
        try {
            divideByZero();
            System.out.println("This will not be reached.");
        } catch (ArithmeticException aex) {
            System.out.println("Tried to divide by zero");
        } finally {
            System.out.println("This will be executed no matter what.");
        }
        readNotExistingArrayIndex();
        classCastFail();
        throwCustomException();
        a();
    }

    /**
     * Calls function b
     */
    private static void a() {
        b();
    }

    /**
     * Causes an ArithmeticException
     */
    private static void b() {
        System.out.println(100 / 0);
    }

    /**
     * Causes an ArithmeticException
     */
    private static void divideByZero() {
        int x = 100 / 0; // throws ArithmeticException
        System.out.println(x);
    }

    /**
     * Causes an ArrayIndexOutOfBoundsException
     */
    private static void readNotExistingArrayIndex() {
        int[] arr = { 1, 2, 3 };
        int elm = arr[3]; // throws ArrayIndexOutOfBoundsException
        System.out.println(elm);
    }

    /**
     * Causes an ClassCastException
     */
    private static void classCastFail() {
        int x = (int) new Object(); // throws ClassCastException
        System.out.println(x);
    }

    /**
     * Causes an CustomException
     */
    private static void throwCustomException() throws CustomException {
        CustomException cx = new CustomException("Hi");
        throw cx;// throws CustomException
    }
}
