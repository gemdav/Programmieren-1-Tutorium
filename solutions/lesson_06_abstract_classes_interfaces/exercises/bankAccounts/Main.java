package solutions.lesson_06_abstract_classes_interfaces.exercises.bankAccounts;

/**
 * Main class with main function to test the functionality
 * 
 * @author David Gemen
 */
public class Main {

    /**
     * Main function, program starts here
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Checking Account
        CheckingAccount ca = new CheckingAccount("comdirect", 10.0, 5.0);
        System.out.println(ca.deposit(-1.0)); // expected: false
        System.out.println(ca.withdraw(20.0)); // expected: false
        System.out.println(ca.withdraw(13.0)); // expected: true
        System.out.println(ca.loot()); // expected: 0.0
        System.out.println(ca.deposit(5.0)); // expected: true
        System.out.println(ca.loot()); // expected: 2.0

        // Savings Account
        BankAccount sa = new SavingsAccount("ing", 15.0);
        System.out.println(sa.withdraw(20.0)); // expected: false
        System.out.println(sa.withdraw(13.0)); // expected: true

        // Piggy Bank
        PiggyBank pb = new PiggyBank();
        System.out.println(pb.feed(-1.0)); // expected: false
        System.out.println(pb.feed(15.0)); // expected: true
        System.out.println(pb.loot()); // expected: 15.0
    }
}
