package solutions.lesson_05_inheritance.exercises.zoo;

/**
 * Elephant
 * 
 * @author David Gemen
 */
public class Elephant extends Animal {

    private String continent;

    /**
     * Elephant constructor
     * 
     * @param name Name of the elephant
     * @param age  Age of the elephant
     * 
     */
    public Elephant(String name, int age, String continent) {
        super(name, age);
        this.continent = continent;
    }

    /**
     * say Elephant credentials
     */
    @Override
    public void sayCredentials() {
        super.sayCredentials();
        System.out.println("My continent is " + this.continent);
    }

    /**
     * Elephant trumpets
     */
    @Override
    public void makeNoise() {
        System.out.println("TÖRÖÖÖ");
    }

}
