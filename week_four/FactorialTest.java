package week_four;

public class FactorialTest {

	/**
	 * Calculates the factorial of a given number.
	 * @param n the number for which the factorial is calculated
	 * @return the factorial of the given number
	 */
	public static int factorial(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("Input cannot be negative");
		}
		if(n==0)
			return 1;
		else
			return n * factorial(n-1);
	}

	public static void main(String[] args) {
		System.out.println("factorial of 3 is: " + factorial(3));
        System.out.println("factorial of 4 is: " +factorial(4));
        System.out.println("factorial of 5 is: " +factorial(5));
        System.out.println("factorial of 6 is: " +factorial(6));
        System.out.println("factorial of 1 is: " +factorial(1));

	}

}
