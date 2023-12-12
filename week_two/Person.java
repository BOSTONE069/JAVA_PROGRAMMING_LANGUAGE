package week_two;

public class Person {
	
	private String name;
	private String email;
	private String phoneNumber;
	
	public Person(String initName, String initEmail, String initPhone) {
		name = initName;
		email = initEmail;
		phoneNumber = initPhone;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone number: " + phoneNumber);
	}

	public static void main(String[] args) {
		Person p1 = new Person("Bostone", "bostone@gmail.com", "+25476889054");
		p1.print();
		
		Person p2 = new Person("Joyce", "joy@gmail.com", "+25475686432");
		p2.print();

	}

}
