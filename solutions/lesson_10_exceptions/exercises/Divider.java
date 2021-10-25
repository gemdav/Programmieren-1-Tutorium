package solutions.lesson_10_exceptions.exercises;

/**
 * Divider class.
 * 
 * @author David Gemen
 */
public class Divider {

    /**
     * Main method, program starts here
     * 
     * @param args cmd line arguments
     */
    public static void main(String[] args) {
        try {
            divide(new int[] { 1, 2, 3 }, 5);
            divide(null, 0.5);
            divide(new int[] { 1, 2, 3 }, 0);
            divide(new int[] { 1, 2, 3 }, "asd");
            divide(new int[0], 0);
        } catch (LolException lx) {
            System.err.println("Lolexception thrown.");
        }
    }

    /**
     * Really strange behaving function that SHOULD divide every element of an array
     * by a divisor and print the result
     * 
     * @param arr     the array with the values to be divided
     * @param divisor the divisor - why the f*** is it of Object type???
     */
    public static void divide(int[] arr, Object divisor) throws LolException {
        try {
            String result = "[";
            System.out.println("Hey, " + arr[0] + " is a really cool integer!");

            for (int elm : arr) {
                result += Double.toString(elm / (int) divisor) + ", ";
            }
            System.out.println(result.substring(0, result.length() - 2) + "]");
        } catch (NullPointerException npx) {
            System.err.println("Array cannot be null");
        } catch (ClassCastException ccx) {
            System.err.println("Cannot cast String to int.");
        } catch (ArithmeticException ax) {
            System.err.println("Cannot divide by 0.");
        } catch (ArrayIndexOutOfBoundsException aioobx) {
            System.err.println("Array must have at least 1 element.");
        } finally {
            throw new LolException("lol");
        }
    }
}
