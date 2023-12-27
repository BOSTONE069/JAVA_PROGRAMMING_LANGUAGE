package week_three;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		
		// This is making a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Benz");
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Rolls Royce");
		
		//Get the iterator
		Iterator<String> it = cars.iterator();
		
		//Loops through the collection
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
