package week_two;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			getInt();
		}
		catch (Exception e) {
			System.out.println("The int should be integers only");
		}

	}
	
	private static void getInt() {
		int myInt = Integer.parseInt("100");
		System.out.println(myInt);
	}

}
