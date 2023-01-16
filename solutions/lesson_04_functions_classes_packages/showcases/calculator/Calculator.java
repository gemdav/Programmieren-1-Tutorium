package calculator;

/**
 * Calculator showcase class
 * 
 * @author David Gemen
 */
public class Calculator {

    /**
     * This function calculates base^exponent
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the result of the calculation or -1 if the params are invalid
     */
    public static int power(int base, int exponent) {
        if(base < 0 || exponent < 0) {
            return -1;
        }
        int product = 1;
        for(int i = 1; i <= exponent; i++) {
            product *= base;
        }
        return product;
    }
}
