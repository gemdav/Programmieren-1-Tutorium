class Fibonacci2 {
    public static void main(String[] args) {
        System.out.println(fibonacci(46));
        //System.out.println(fibonacciIterative(46));
    }

    private static int fibonacci(int n) {
        if(n < 0) {
            return -1;
        }
        if(n < 2) {
            return n;
        }
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
}