package solutions.lesson_03_arrays_loops_parameterization.showcases;

/**
 * Break and continue showcase class
 * 
 * @author David Gemen
 */
public class BreakContinue {

    /**
     * main function, program entry point
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // break example
        int counter = 0;
        while (counter <= 10) {
            counter++;
            if (counter == 5) {
                break;
            }
            System.out.println(counter);
        }

        System.out.println("----------");

        // continue example
        int counter2 = 0;
        while (counter2 <= 10) {
            counter2++;
            if (counter2 % 2 == 1) {
                continue;
            }
            System.out.println(counter2);
        }
    }
}
