package solutions.lesson_01_first_steps_with_java.exercises;

/**
 * My Credentials class
 * 
 * @author David gemen
 */
public class MyCredentials {

    /**
     * Main function, entry point of the program
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // my credentials
        String name = "David";
        int age = 21;
        boolean presentNextWeek = true;

        String ageStatus;
        if (age < 18) {
            ageStatus = "minderjährig ";
        } else if (age < 67) {
            ageStatus = "volljährig ";
        } else {
            ageStatus = "im Ruhestand ";
        }

        String nextWeekDenial = presentNextWeek ? "" : "nicht ";

        System.out.println("Ich heiße " + name + ", bin " + ageStatus + "und komme nächste Woche " + nextWeekDenial
                + "wieder zum Tutorium.");
    }

}
