package solutions.lesson_07_abstract_classes_interfaces.exercises.bankAccounts;

/**
 * Checking Account class
 * 
 * @author David Gemen
 */
public class CheckingAccount extends BankAccount implements Lootable {

    private double dispoLimit;

    /**
     * Constructor of this class
     * 
     * @param bank       the bank the account belongs to
     * @param balance    the initial balance of the account
     * @param dispoLimit the dispoLimit of the account
     */
    public CheckingAccount(String bank, double balance, double dispoLimit) {
        super(bank, balance);
        this.dispoLimit = dispoLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        double balance = super.getBalance();
        if (amount <= balance + dispoLimit) {
            super.setBalance(balance - amount);
            return true;
        }
        return false;
    }

    @Override
    public double loot() {
        double loot = super.getBalance();
        if (loot > 0) {
            super.setBalance(0.0);
            return loot;
        }
        return 0.0;
    }
}
