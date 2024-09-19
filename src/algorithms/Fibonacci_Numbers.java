package algorithms;

public class Fibonacci_Numbers {
	static int n = 20;
	static int count = 2;

	public static void main(String[] args) {
		 fibonacciNumbersByLoop(n);

		int prev2 = 0;
		int prev1 = 1;
//		printNumber(prev2);
//		printNumber(prev1);
//		fibonacciNumbersByRecursion(prev2, prev1);
		int nth_value = fibonacciNumbersByRecursion_find_nth_value(4);
		System.out.println("\n"+nth_value);
	}

	public static void fibonacciNumbersByLoop(int n) {
		int prev2 = 0;
		int prev1 = 1;
		printNumber(prev2);
		printNumber(prev1);
		for (int i = 0; i < n - 2; i++) {
			int nextDigit = prev2 + prev1;
			prev2 = prev1;
			prev1 = nextDigit;
			printNumber(nextDigit);
		}
	}

	public static void fibonacciNumbersByRecursion(int prev2, int prev1) {
		if (count < n) {
			int nextDigit = prev2 + prev1;
			printNumber(nextDigit);
			prev2 = prev1;
			prev1 = nextDigit;
			count++;
			fibonacciNumbersByRecursion(prev2, prev1);
		}

	}
	
	public static int fibonacciNumbersByRecursion_find_nth_value(int n) {
		if(n <= 1) {
			return n ;
		}
		else {
			return fibonacciNumbersByRecursion_find_nth_value(n-1) + fibonacciNumbersByRecursion_find_nth_value(n-2);
		}
	}

	public static void printNumber(int n) {
		System.out.print(n + ", ");
	}

}
