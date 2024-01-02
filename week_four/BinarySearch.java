package week_four;

import java.util.ArrayList;

public class BinarySearch {

    public static int binarySearch(ArrayList<Integer> list, int target){

        int low = 0;
        int high = list.size() - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(list.get(mid) == target) {
                return mid;
            } else if(list.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
    }
        return  -1;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int key = 4;

        int result = binarySearch(list, key);

        if (result == -1) {
            System.out.println("Element not present in the list");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}
