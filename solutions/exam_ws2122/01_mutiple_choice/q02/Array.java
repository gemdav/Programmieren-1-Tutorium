public class Array implements Other {
    private int[] a = {0,1,2,3,4,5,6,7,8,9};

    private void print() {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public void foo () {
        for (int i : a) {
            i = 0;
        }
        print();
    }

    public void bar() {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = a[i] - a[n - 1 - i];
            a[n - 1 - i] = a[i] + a[n - 1 - i];
            a[i] = a[n - 1 - i] - a[i];
        }
        print();
    }
}


