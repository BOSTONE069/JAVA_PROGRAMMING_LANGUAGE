package week_two;

public class overLoading {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {
		overLoading numbersToAdd = new overLoading();
		
		System.out.println(numbersToAdd.add(70, 90));
		System.out.println(numbersToAdd.add(80, 60, 40));
		System.out.println(numbersToAdd.add(30, 50,60, 20));
		

	}

}
