public class Syntax {
    public static void main(String[] args) {
        int x;

        x = 42;
        int result1 = x++ % 2;
        System.out.println("result: " + result1);

        x = 42;
        double result2 = 2 * x * 0.5;
        System.out.println("result: " + result2);

        x = 42;
        String result3 = "A" + x + "B" + 3.14;
        System.out.println("result: " + result3);

        x = 42;
        int result4 = 5 / 2;
        System.out.println("result: " + result4);

        x = 42;
        int result5 = ++x - 20;
        System.out.println("result: " + result5);
    }
}
