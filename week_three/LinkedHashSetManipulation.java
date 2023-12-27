package week_three;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetManipulation {

	public static void main(String[] args) {
		LinkedHashSet<String> setValues = new LinkedHashSet<>();
		setValues.add("A");
		setValues.add("B");
		setValues.add("C");
		setValues.add("D");
		
		System.out.println("Set size: " + setValues.size());
		
		System.out.println("Elements in the set (using for each loop):");
		for(String Element : setValues) {
			System.out.println("Element: " + Element);
		}
		
		System.out.println("Elements in the set (using iterator):");
		Iterator<String> iterator = setValues.iterator();
		while(iterator.hasNext()) {
			 System.out.println("Iterator Elements: " + iterator.next());
		}
		
		setValues.remove("A");
		System.out.println("The set after using the remove methos: " + setValues);
		
		if(setValues.contains("B")) {
			System.out.println("Element 'B' exists in the set");
		} else {
			System.out.println("Element 'B' does not exist in the set.");
		}
		
		setValues.clear();
		System.out.println("Set after using clear(): " + setValues);
	}

}
