package week_four;

import java.util.ArrayList;

public class ArrayListModification {
    public static void main(String[] args) {
    	
    	ArrayList<String> languages = new ArrayList<>();
    	
    	languages.add("Java");
    	languages.add("javascript");
    	languages.add("swift");
    	languages.add("python");
    	languages.add("php");
    	languages.add("Rust");
    	
    	System.out.println("Original ArrayList: " + languages);
    	
    	languages.forEach(language -> System.out.println(language));
    	
    	
    	languages.replaceAll(language -> language.toUpperCase());
    	
    	System.out.println("\nUpdated ArrayList:" + languages);
    	
    	 // Print the updated ArrayList using forEach and a lambda
        languages.forEach(language -> System.out.println(language));
    	
        
    }
}
