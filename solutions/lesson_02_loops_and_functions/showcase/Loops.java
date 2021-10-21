package solutions.lesson_02_loops_and_functions.showcase;

/**
 * Loops and functions showcase
 * 
 * @author David Gemen
 */
public class Loops {

    /**
     * main function, program entry point
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // while loop
        int whileCounter = 0;
        while (whileCounter < 10) {
            System.out.println(whileCounter);
            whileCounter++;
        }

        System.out.println("----------");

        // do-while loop
        int doWhileCounter = 0;
        do {
            System.out.println(doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter < 10);

        System.out.println("----------");

        // for loop
        for (int forCounter = 0; forCounter <= 9; forCounter++) {
            System.out.println(forCounter);
        }

        System.out.println("----------");

        // forEach loop
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
