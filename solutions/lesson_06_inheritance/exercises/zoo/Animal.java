/**
 * Animal
 * 
 * @author David Gemen
 */
public class Animal {

    /* Attributes */
    private String name;
    private int age;
    private static int animalAmount = 0;

    /**
     * Animal constructor
     * 
     * @param name Name of the animal
     * @param age  Age of the Animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalAmount++;
    }

    /**
     * Print animals credentials
     */
    public void sayCredentials() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old.");
    }

    /**
     * Make animal noise
     */
    public void makeNoise() {
        System.out.println("Generic Animal Noise.");
    }

    /**
     * get total animal count
     */
    public static int getAnimalAmount() {
        return animalAmount;
    }

}