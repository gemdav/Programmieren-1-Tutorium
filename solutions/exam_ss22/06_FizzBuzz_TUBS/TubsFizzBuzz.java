public class TubsFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i += 3) {
	
            if ( i % 5 == 0 || i % 13 == 0) {
                System.out.println("TUBS");
                continue;
            }
            
            System.out.println(i);
        }
    }
}
