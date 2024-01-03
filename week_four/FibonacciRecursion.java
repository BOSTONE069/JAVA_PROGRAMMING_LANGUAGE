package week_four;

public class FibonacciRecursion {
	
	public static int calculateFibonacci(int n) {
		if(n <= 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		int fib1 = calculateFibonacci(n-1);
		int fib2 = calculateFibonacci(n-2);
		
		return fib1 + fib2;
	}

	public static void main(String[] args) {
		 System.out.println("First 10 Fibonacci Numbers:");
		 
		 for (int i =0; i < 10; i++) {
			 int result = calculateFibonacci(i);
			 System.out.println("Fibonacci(" + i + ") = " + result);
		 }

	}

}
