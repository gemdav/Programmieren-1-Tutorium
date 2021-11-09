package solutions.lesson_08_polymorphism_equals_toString_pbv_pbr.showcases;

/**
 * This class shows the difference between "Pass by Value" and "Pass by
 * Reference". In Java all objects are always passed by reference. If only the
 * value should be passed, a copy has to be created manually (Object.clone()).
 * Primitive data types are passed by value. That means that if a variable of a
 * primitive data type is passed to a function, the function is working on a
 * copy of the variable.
 * 
 * @author David Gemen
 */
public class PBVvsPBR {

    /**
     * Main function, program starts here.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int primitive = 0; // primitive
        int[] object = { 0 }; // array is an object

        increment(primitive);
        increment(object);

        System.out.println(primitive); // expected: 0
        System.out.println(object[0]); // expected: 1
    }

    public static void increment(int x) {
        x++;
    }

    public static void increment(int[] x) {
        x[0]++;
    }
}
