public class Recursion {
    static String[] buffer = {"p", "f", "u", "r", "n", "f", "o", "u", "n", "g"};
    
    static String r(int i, String s) {
        System.out.println("i: " + i + ", s: " + s);
        if (i < 0) {
            return s;
        }
        if (i % 3 != 0) {
            return r(i - 1, s);
        }
        return r(i - 1, buffer[i] + s);
    }

    public static void main(String[] args) {
        System.out.println(r(9, ""));
    }
}
