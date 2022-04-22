/**
 * Savings Account class
 * 
 * @author David Gemen
 */
public class SavingsAccount extends BankAccount {

    /**
     * Constructor of this class
     * 
     * @param bank    the bank the account belongs to
     * @param balance the initial balance of the classs
     */
    public SavingsAccount(String bank, double balance) {
        super(bank, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        double balance = super.getBalance();
        if (balance >= amount) {
            super.setBalance(balance - amount);
            return true;
        }
        return false;
    }

}
