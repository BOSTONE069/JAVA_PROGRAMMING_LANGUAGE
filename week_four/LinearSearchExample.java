package week_four;

import java.util.ArrayList;

public class LinearSearchExample {
    // This code is written in Java and provides a method for linear search in an ArrayList.
  // It takes an ArrayList and a target integer as input, and returns the index of the target if found, otherwise -1.

    public static int linearSearch(ArrayList<Integer> list, int target){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == target){
                return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

		int target = 30;

		int index = linearSearch(numbers, target);

		if (index != -1){
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + "not found in the ArrayList");
		}

	}

}
