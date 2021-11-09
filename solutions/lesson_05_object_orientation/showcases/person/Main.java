package solutions.lesson_05_object_orientation.showcases.person;

/**
 * Main class for person showcase
 * 
 * @author David Gemen
 */
public class Main {

    /**
     * Main function, program starts here
     * 
     * @param args
     */
    public static void main(String[] args) {

        Person david = new Person("David", "Gemen", 21);
        david.celebrateBirthday();
        System.out.println(david.getAge()); // 22

        System.out.println(Person.getPersonAmount()); // 1
    }
}
