package week_three;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
    	
    	//Note: It is recommended to use ArrayList in place of Vector because vectors less efficient.
        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
        
     // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);
        
     // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        
     // Using remove()
        String elements = animals.remove(1);
        System.out.println("Removed Element: " + elements);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}

