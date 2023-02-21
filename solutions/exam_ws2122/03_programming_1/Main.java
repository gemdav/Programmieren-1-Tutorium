public class Main {
    public static void main(String[] args) {
        Rectangle ra = new Rectangle(3, 2, 'a');
        Rectangle rb = new Rectangle(3, 5, 'b');
        Rectangle rc = new Rectangle(3, 3);

        ra.print();
        System.out.println("----------------------------");
        rb.print();
        System.out.println("----------------------------");
        rc.print();
        System.out.println("----------------------------");
        ra.add(rb).print();
        System.out.println("----------------------------");
        ra.add(rb).add(ra).print();
    }
}


