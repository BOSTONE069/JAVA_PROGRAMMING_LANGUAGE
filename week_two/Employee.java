package week_two;

public class Employee extends PersonalDetails {
	
	private int id;

	public Employee(String theName, int id) {
		super(theName);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public static void main(String[] args) {
		 Employee emp = new Employee("Dani", 10);

	     System.out.println(emp.getName());
	     System.out.println(emp.getId());

	}

	
}
