package intro_to_java;

import java.util.Scanner;

public class StepsToZero {
	
	public static int numberOfSteps(int num) {
		int steps = 0;
		
		while (num > 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num -= 1;
			}
			steps++;
		}
		
		return steps;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to be checked; ");
		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
		
		int steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
	}

}
