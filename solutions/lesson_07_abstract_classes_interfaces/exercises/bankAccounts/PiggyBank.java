/**
 * Piggy bank class
 * 
 * @author David Gemen
 */
public class PiggyBank implements Lootable {

    private double balance = 0.0;

    /**
     * Feed the piggy bank with money
     * 
     * @param amount the amount of money to put into the piggy bank
     * @return true if the amount was put into it, false if not
     */
    public boolean feed(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public double loot() {
        double loot = balance;
        this.balance = 0.0;
        return loot;
    }
}
