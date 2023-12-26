package week_three;

import java.util.Stack;

public class StackDataStructure {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		
		//adding elements into the stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		
		System.out.println("Stack: " + animals);
		
		
		//removing element sin the stack
		String element = animals.pop();
		System.out.println("Removed Element: " + element);
		
		// Access element from the top
        String elements = animals.peek();
        System.out.println("Element at top: " + elements);
		
		// Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
        
     // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
	}

}
