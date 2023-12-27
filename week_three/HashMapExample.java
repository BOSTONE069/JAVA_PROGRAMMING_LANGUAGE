package week_three;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
		
		//Inserting elements in a HashMap
		numbers.put("a", 20);
		numbers.put("k", 45);
		numbers.put("h", 67);
		numbers.put("v", 34);
		numbers.put("t", 56);
		
		//Removing elements in a HashMap
		numbers.remove("v");
		
		//Removes all of the entries from this Map 
		//numbers.clear();
		System.out.println(numbers);
		
		System.out.println(numbers.isEmpty()); // Returns true if the Map contains no key-value mappings
		
		 //This method returns true if the provided value is equal to a value that exists within the Map. Otherwise, it returns false.
		System.out.println(numbers.containsValue(20));
		
		//This method returns true if the provided key is equal to a key that exists within the Map. Otherwise, it returns false.
		System.out.println(numbers.containsKey("t"));
		
		//Returns the value associated with the provided key.
		System.out.println(numbers.get("a"));
		
		//Replaces the specified value at the specified key.
		System.out.println(numbers.replace("k", 70));
		
		//Returns the number of entries in the map.
		System.out.println(numbers.size());
		
		System.out.println(numbers);

	}

}
