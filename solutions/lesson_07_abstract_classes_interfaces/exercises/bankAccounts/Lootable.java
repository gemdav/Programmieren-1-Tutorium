/**
 * Lootable interface. Classes that implement this interface must have the loot
 * method
 * 
 * @author David Gemen
 */
public interface Lootable {

    /**
     * Completely loot something
     * 
     * @return the looted amount
     */
    public double loot();

}
