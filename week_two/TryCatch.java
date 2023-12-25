package week_two;

public class TryCatch {
	
	public static void main(String[] args) {
	    try {
	      int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
	      System.out.println(myNumbers[8]); 
	    } catch (Exception e) {
	      System.out.println("Something went wrong in numbers printing function. Error: " + e);
	    } finally {
	      System.out.println("The 'try catch' block has finished.");
	    }
	    System.out.println("That was easy.");
	  }

}
