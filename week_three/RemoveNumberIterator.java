package week_three;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNumberIterator {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(23);
		numbers.add(34);
		numbers.add(56);
		numbers.add(87);
		numbers.add(89);
		numbers.add(87);
		
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext()) {
			Integer i = it.next();
			if (i < 50) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
