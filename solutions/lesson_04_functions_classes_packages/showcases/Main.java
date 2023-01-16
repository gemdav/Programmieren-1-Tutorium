import calculator.Calculator;

/**
 * Calculator showcase main class
 * 
 * @author David Gemen
 */
public class Main {

    /**
     * Main function, programs entry pouint
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        int power = Calculator.power(base, exponent);
        System.out.println( base + " hoch " + exponent + " ist " + power);
    }
}
