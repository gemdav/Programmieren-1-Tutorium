/**
 * Main Class
 * 
 * @author David Gemen
 */
public class Main {

    /**
     * Main function, program starts here
     * 
     * @param args command line args
     */
    public static void main(String[] args) {
        Animal luisa = new Animal("Luisa", 10);
        luisa.makeNoise(); // Generic animal noise.
        luisa.sayCredentials(); // My name is ...

        Animal andreas = new Tiger("Andreas", 4);
        andreas.makeNoise(); // ROARRR
        andreas.sayCredentials(); // My name is ...

        Animal martin = new Elephant("Martin", 4, "Africa");
        martin.makeNoise(); // TÖRÖÖÖ
        martin.sayCredentials(); // My name is ... \n My continent is ...

        System.out.println("This zoo has " + Animal.getAnimalAmount() + " animals."); // 3
    }
}
