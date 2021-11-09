package solutions.lesson_08_polymorphism_equals_toString_pbv_pbr.exercises;

/**
 * Address class
 * 
 * @author David Gemen
 */
public class Address {

    private String street;
    private String hnr;
    private int zip;
    private String city;

    public Address(Address address) {
        this.street = address.street;
        this.hnr = address.hnr;
        this.zip = address.zip;
        this.city = address.city;
    }

    public Address(String street, String hnr, int zip, String city) {
        this.street = street;
        this.hnr = hnr;
        this.zip = zip;
        this.city = city;
    }

    public Address(String street, int hnr, int zip, String city) {
        this.street = street;
        this.hnr = Integer.toString(hnr);
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return street + " " + hnr + "\n" + zip + " " + city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address other = (Address) obj;
        // house number
        if (hnr == null) {
            if (other.hnr != null) {
                return false;
            }
        } else if (!hnr.equals(other.hnr)) {
            return false;
        }
        // street
        if (street == null) {
            if (other.street != null) {
                return false;
            }
        } else if (!street.equals(other.street)) {
            return false;
        }
        // zip
        if (zip != other.zip) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Address adr1 = new Address("Katharinenstraße", "1", 38106, "Braunschweig");
        Address adr2 = new Address(adr1);
        Address adr3 = new Address("Katharinenstraße", 2, 38106, "Braunschweig");
        Address adr4 = new Address("Katharinenstraße", 1, 38106, "Atlantis");

        // toString
        System.out.println(adr1);

        // equals
        System.out.println(adr1.equals(adr2)); // expected: true
        System.out.println(adr1.equals(adr3)); // expected: false
        System.out.println(adr1.equals(adr4)); // expected: true
    }
}
