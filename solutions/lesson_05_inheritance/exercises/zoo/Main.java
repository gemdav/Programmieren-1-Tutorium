package solutions.lesson_05_inheritance.exercises.zoo;

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
        luisa.makeNoise();
        luisa.sayCredentials();

        Animal andreas = new Tiger("Andreas", 4);
        andreas.makeNoise();
        andreas.sayCredentials();

        Animal martin = new Elephant("Martin", 4, "Africa");
        martin.makeNoise();
        martin.sayCredentials();

        System.out.println("This zoo has " + Animal.getAnimalAmount() + " animals.");
    }
}
