package week_three;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> namesForTheQueue = new LinkedList<>();

	    // add elements
		namesForTheQueue.add("Python");
		namesForTheQueue.add("Java");
		namesForTheQueue.add("C");
	    System.out.println("LinkedList: " + namesForTheQueue);

	    // access the first element
	    String str1 = namesForTheQueue.peek();
	    System.out.println("Accessed Element: " + str1);

	    // access and remove the first element
	    String str2 = namesForTheQueue.poll();
	    System.out.println("Removed Element: " + str2);
	    System.out.println("LinkedList after poll(): " + namesForTheQueue);

	    // add element at the end
	    namesForTheQueue.offer("Swift");
	    System.out.println("LinkedList after offer(): " + namesForTheQueue);
	  }

}
