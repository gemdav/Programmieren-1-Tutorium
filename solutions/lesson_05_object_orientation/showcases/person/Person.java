package solutions.lesson_05_object_orientation.showcases.person;

/**
 * Person showcase class
 * 
 * @author David Gemen
 */
public class Person {

    // Attributes
    private String firstName;
    private String lastName;
    private int age;

    // Class variables
    private static final int LEG_AMOUNT = 2;
    private static int personAmount = 0;

    /**
     * Constructor to instantiate class
     * 
     * @param firstName the first name of the person
     * @param lastName  the last name of the person
     * @param age       the age of the person
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        personAmount++;
    }

    /**
     * Constructor to instantiate class
     */
    public Person() {
        personAmount++;
    }

    // Methods
    /**
     * When a person celebrates Birthday its age is increased
     */
    public void celebrateBirthday() {
        this.age++;
    }

    /**
     * prints the name of the person to stdout
     */
    public void sayName() {
        System.out.println("My name is" + this.firstName + " " + this.lastName);
    }

    // Functions
    /**
     * Getter for the person amount class variable
     * 
     * @return the amount of persons created
     */
    public static int getPersonAmount() {
        return personAmount;
    }

    public static void printLegAmount() {
        System.out.println(LEG_AMOUNT);
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
