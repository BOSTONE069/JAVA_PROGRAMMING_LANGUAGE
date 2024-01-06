package week_four;

import java.util.Arrays;

public class ArrayBinarySearch {

	 public void Start() {
		// Given input:
		 int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		 int key = 22;

	     Arrays.sort(arr);
	
	     int result = binarySearch(arr, key);
	
	     if (result != -1) {
	            System.out.println("Element " + key + " found at index " + result);
	        } else {
	            System.out.println("Element " + key + " not found in the array.");
	      }
	    }
	  int binarySearch(int[] arr, int key){
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high){
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        ArrayBinarySearch mains = new ArrayBinarySearch();
	        mains.Start();
	    }

}
