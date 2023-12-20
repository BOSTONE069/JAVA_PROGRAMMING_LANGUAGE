package week_two;


class Calculator implements Operations {
    // no need to implement add method, as we are using default method
}

public class Calculation {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 7);
		System.out.println("Result of add: " + result);//Result of add: 12
		int randomNumber = Operations.getRandomNumber();
		System.out.println("Random number: " + randomNumber);
	}

}
