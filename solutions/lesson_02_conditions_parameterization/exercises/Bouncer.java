package solutions.lesson_02_conditions_parameterization.exercises;

import java.util.Scanner;

/**
 * Bouncer class
 * 
 * @author David Gemen
 */
public class Bouncer {

    /**
     * main function, program starts here
     * 
     * @param args command line argument
     */
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        if (age >= 18) {
            System.out.println("Du kommst rein.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kennst du den Türsteher? (ja/nein) ");
            boolean knowsBouncer = scanner.next().equals("ja");
            scanner.close();
            if (knowsBouncer) {
                System.out.println("Du kommst rein.");
            } else {
                System.out.println("Du kommst nicht rein.");
            }
        }
    }
}
