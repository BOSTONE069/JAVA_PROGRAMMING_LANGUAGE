package week_two;

public class Person {
	
	//These are the instance variables
	private String name;
	private String email;
	private String phoneNumber;
	
	//This is the constructor: Construct a person copying in the data to the instance variables
	public Person(String initName, String initEmail, String initPhone) {
		name = initName;
		email = initEmail;
		phoneNumber = initPhone;
	}
	
	//Printing all the data for the person
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone number: " + phoneNumber);
	}

	public static void main(String[] args) {
		// calling the constructor to create a new person
		
		Person p1 = new Person("Bostone", "bostone@gmail.com", "+25476889054");
		p1.print();
		
		Person p2 = new Person("Joyce", "joy@gmail.com", "+25475686432");
		p2.print();

	}

}
