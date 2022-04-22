/**
 * Bank Account class
 * 
 * @author David Gemen
 */
public abstract class BankAccount {

    private String bank;
    private double balance;

    /**
     * Constructor of this class
     * 
     * @param balance initial Bank account balance
     */
    public BankAccount(String bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    /**
     * Deposits the amount if it is bigger that 0
     * 
     * @param amount the amount to deposit
     */
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Withdraws money if it is possible
     * 
     * @param amount the amount to withdraw
     * @return true if the withdrawal was successful, false if not
     */
    public abstract boolean withdraw(double amount);

    // Getters and Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
