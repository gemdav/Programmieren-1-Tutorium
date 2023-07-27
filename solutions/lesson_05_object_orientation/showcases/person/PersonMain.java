/**
 * Main class for person showcase
 * 
 * @author David Gemen
 */
public class PersonMain {

    /**
     * Main function, program starts here
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Person emptyReference = null;
        // emptyReference.celebrateBirthday(); // NullpointerException

        Person david = new Person("David", "Gemen", 23);

        david.celebrateBirthday();
        System.out.println(david.getFirstName()); // David
        System.out.println(david.getAge()); // 22

        System.out.println(Person.getPersonAmount()); // 1
    }
}
