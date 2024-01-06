package week_four;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 1) {
			return;
		}
		
		for(int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			
			while (j >= 0 && current < arr[j]) {
				arr[j + i] = arr[j];
				j--;
			}
			
			arr[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		int[] arr = {3, 4, 1, -2, 4, 8};
		insertionSort(arr);
		
		System.out.println("Sorted array: ");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i] + " ");
		}

	}

}
