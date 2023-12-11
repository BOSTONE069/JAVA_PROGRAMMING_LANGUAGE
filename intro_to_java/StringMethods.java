package intro_to_java;

public class StringMethods {

	public static void main(String[] args) {
		String message1 = "This is a test";
		
		String message2 = "Hello Class";
		
		System.out.println(message1.length());
		System.out.println(message2.length());
		
		System.out.println(message1.substring(0,3));
		
		System.out.println(message1.indexOf("p"));
		
		System.out.println(message2.toLowerCase());
	}

}
