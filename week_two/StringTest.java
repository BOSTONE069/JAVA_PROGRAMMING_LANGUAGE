package week_two;

public class StringTest {
	   public static void main(String[] args) {
	      String s1 = "hi";
	      String s2 = "Hi";
	      String s3 = new String("hi");
	      System.out.println(s1.equals(s2));
	      System.out.println(s2.equals(s3));
	      System.out.println(s1.equals(s3));
	   }
	}
