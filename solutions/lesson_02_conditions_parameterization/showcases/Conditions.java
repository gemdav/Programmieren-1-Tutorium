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
        int x = 42;
        if (x == 42) {
            System.out.println("x ist 42!");
        } else if (x < 42) {
            System.out.println("x ist kleiner als 42!");
        } else {
            System.out.println("Hmmmm");
        }

        // switch-case
        String month = "may";
        switch (month) {
            case "schrodingersMonth":
                System.out.println("Monat hat 30 Tage!");
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("Monat hat 31 Tage!");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("Monat hat 30 Tage!");
                break;
            case "february":
                System.out.println("Monat hat 28 Tage!");
                break;
            default:
                System.out.println("Ich kenne diesen Monat nicht.");
                break;
        }

        // ternary operator
        int myAge = 21;
        String ageStatus = myAge >= 18 ? "erwachsen" : "minderjährig";
        System.out.println("Ich bin " + ageStatus);
    }
}