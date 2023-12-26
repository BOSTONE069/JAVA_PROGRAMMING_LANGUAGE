package week_three;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> namesLinkedList = new LinkedList<>();
		
		//adding elements in a linked list
		namesLinkedList.add("Bostone");
		namesLinkedList.add("Velma");
		namesLinkedList.add("Vivian");
		namesLinkedList.add("John");
		
		System.out.println(namesLinkedList.get(3));
		
		// add() method with the index parameter
		namesLinkedList.add(2, "Joy");
		System.out.println(namesLinkedList);
		

	}

}
