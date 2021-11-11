package solutions.lesson_03_arrays_loops_parameterization.exercises;

import java.util.Scanner;

/**
 * Name database class
 * 
 * @author David Gemen
 */
public class NameDatabase {

    /**
     * main function, program starts here
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // take command line arguments initially
        String[] names = args;

        // init scanner
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // take query
            System.out.print("Bitte gib den Namen ein: ");
            String query = scanner.next();

            if (query.equals("quit")) {
                scanner.close();
                break;
            }

            boolean found = false;
            for (String name : names) {
                if (name.equals(query)) {
                    System.out.println("Der Name existiert in dem Datensatz.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Der Name existiert nicht in dem Datensatz.");

                // optional
                String[] newNames = new String[names.length + 1];
                for (int i = 0; i < names.length; i++) {
                    newNames[i] = names[i];
                }
                newNames[names.length] = query;
                names = newNames;
            }
        }
    }
}
