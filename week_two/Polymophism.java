package week_two;

class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird {
	public void sing() {
		System.out.println("Kwaaaa Kwaaaaa");
	}
}

public class Polymophism {

	public static void main(String[] args) {
		Robin firstBird = new Robin();
		firstBird.sing();

	}

}
