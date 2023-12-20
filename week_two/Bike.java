package week_two;

public class Bike extends Vehicle {
	
	@SuppressWarnings("unused")
	private String bikeHandle;

	public Bike(String color, String brand, String bikeHandle) {
		super(color, brand);
		this.bikeHandle = bikeHandle;
	}
	
	@Override
	public void print() {
	    System.out.println("I am Bike");
	}

}
