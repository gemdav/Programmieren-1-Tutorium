package src.lesson_10_exceptions;

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
        divide(new int[] { 1, 2, 3 }, 5);
        divide(null, 0.5);
        divide(new int[] { 1, 2, 3 }, 0);
        divide(new int[] { 1, 2, 3 }, "asd");
        divide(new int[0], 0);
    }

    /**
     * Really strange behaving function that SHOULD divide every element of an array
     * by a divisor and print the result
     * 
     * @param arr     the array with the values to be divided
     * @param divisor the divisor - why the f*** is it of Object type???
     */
    public static void divide(int[] arr, Object divisor) {
        String result = "[";
        System.out.println("Hey, " + arr[0] + " is a really cool integer!");

        for (int elm : arr) {
            result += Double.toString(elm / (int) divisor) + ", ";
        }
        System.out.println(result.substring(0, result.length() - 2) + "]");
    }
}
