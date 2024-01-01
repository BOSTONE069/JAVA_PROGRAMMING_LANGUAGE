package week_four;

import java.util.ArrayList;

public class BinarySearchExample {

	/**
	 * @param list
	 * @param target
	 * @return
	 */
	// This code implements the binary search algorithm to find the index of a target element in a sorted ArrayList of integers.

	public static int binarySearch(ArrayList<Integer> list, int target) {
		int left = 0;
		int right = list.size() - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (list.get(mid) == target){
				return mid;
			}
			if (list.get(mid) < target){
				left = mid + 1;
			} else {
				right = mid - 1;
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

		int target = 50;

		int index = binarySearch(numbers, target);

		if (index != -1){
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + "not found in the ArrayList");
		}

	}

}
