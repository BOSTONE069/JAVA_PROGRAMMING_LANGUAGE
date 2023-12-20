package week_two;

public class Car extends Vehicle{
	
	@SuppressWarnings("unused")
	private String steeringWheel;

	public Car(String color, String brand, String steeringWheel) {
		super(color, brand);
		this.steeringWheel = steeringWheel;
	}
	
	@Override
	public void print() {
	    System.out.println("I am Car");
	}

}
