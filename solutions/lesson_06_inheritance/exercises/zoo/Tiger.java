/**
 * Tiger
 * 
 * @author David Gemen
 */
public class Tiger extends Animal {

    /**
     * Tiger constructor
     * 
     * @param name Name of the tiger
     * @param age  Age of the tiger
     */
    public Tiger(String name, int age) {
        super(name, age);
    }

    /**
     * Tiger roars
     */
    @Override
    public void makeNoise() {
        System.out.println("ROARRRR");
    }
}
