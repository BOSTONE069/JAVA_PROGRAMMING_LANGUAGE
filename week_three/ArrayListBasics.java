package week_three;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList<String> nameList = null; //Declaration of the array list
		System.out.println(nameList);
		
		
		nameList = new ArrayList<String>(); // Allocate memory
		System.out.println(nameList);
		System.out.println("Size is " + nameList.size());
		
		//Adding data to the namelist array data structure
		nameList.add("Kevin");
		System.out.println(nameList);
		nameList.add("Joy");
		System.out.println(nameList);
		nameList.add("Bostone");
		System.out.println(nameList);
		nameList.add("Esther");
		System.out.println(nameList);
		System.out.println("Size is " + nameList.size());
		
		//Add data with index
		nameList.add(3, "Rhemney");
		System.out.println(nameList);
		System.out.println("Size is " + nameList.size());
		
		//Getting data from the name list array
		System.out.println("Name at the indes of 2 is " + nameList.get(2));
		
		//Setting data in array list
		nameList.set(1, "Susan");
		System.out.println(nameList);
		System.out.println("Size is " + nameList.size());
		
		//Removing data from the namelist ArrayList
		nameList.remove(3);
		System.out.println(nameList);
		System.out.println("Size is " + nameList.size());
		
		
	}

}
