public class Main {
    public static void main(String[] args) {
        int a = B.a;
        int b = C.b;
        A c = new A();
        B.a = new C().b;
    }
}
