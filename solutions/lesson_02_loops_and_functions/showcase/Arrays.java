package solutions.lesson_02_loops_and_functions.showcase;

/**
 * Arrays showcase class
 * 
 * @author David Gemen
 */
public class Arrays {

    /**
     * main function, program entry point
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        String[] weekdays;

        // new empty array of length 7
        weekdays = new String[] { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };

        weekdays[3] = "Dönerstag"; // manipulate 4th element

        String fav = weekdays[5]; // Samstag fav day

        System.out.println(fav);

        // multidimensional example

        // declaration of multidimensional array
        int[][] matrix = new int[][] { { 2, 4 }, { 3, 1 } };

        // calculation of determinant
        int determinant = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];

        System.out.println(determinant);
    }
}
