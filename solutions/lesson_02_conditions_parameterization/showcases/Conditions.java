package solutions.lesson_02_conditions_parameterization.showcases;

/**
 * Conditions showcase class
 */
public class Conditions {

    /**
     * main function, program has its entry point here
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // if-else
        boolean dumbOpinion = 1 > 2;
        char xChar = 'x';
        boolean cleverOpinion = xChar == 'x';
        if (dumbOpinion) {
            System.out.println("dumbOpinion ist richtig!");
        } else if (cleverOpinion) {
            System.out.println("cleverOpinion ist richtig!");
        } else {
            System.out.println("Keine Meinung ist richtig");
        }

        // switch-case
        String day = "wednesday";
        switch (day) {
        case "wednesday":
            System.out.println("Ist zwar Bergfest, aber ...");
        case "sunday":
        case "monday":
        case "tuesday":
        case "thursday":
            System.out.println("Nee man, muss morgen arbeiten.");
            break;
        case "friday":
        case "saturday":
            System.out.println("JAAA MAN! WOCHENENDE! SAUFEN! GEIL!");
            break;
        default:
            System.out.println("Ich kenne diesen Wochentag nicht.");
            break;
        }

        // ternary operator
        int myAge = 21;
        String ageStatus = myAge >= 18 ? "erwachsen" : "minderjährig";
        System.out.println("Ich bin " + ageStatus);
    }
}