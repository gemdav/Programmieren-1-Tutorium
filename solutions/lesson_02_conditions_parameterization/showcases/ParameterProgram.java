import java.util.Scanner;

/**
 * Parameter showcase program
 * 
 * @author David Gemen
 */
public class ParameterProgram {

    /**
     * main function, program entry point
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        String ageStatus = (age >= 18) ? "volljährig" : "minderjährig";

        System.out.println("Möchtest du eine Kommanduzeilenausgabe erhalten ? (ja/nein)");

        Scanner scanner = new Scanner(System.in);
        String param = scanner.next();
        scanner.close();

        if (param.equals("ja") || param.equals("Ja")) {
            System.out.println("Ich bin " + name + " und " + ageStatus);
        }
    }

}
