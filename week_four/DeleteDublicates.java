package week_four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

public class DeleteDublicates {

    public static List<Integer> deleteDublicates(List<Integer> nums){
        if(nums == null || nums.isEmpty()){
            return new ArrayList<Integer>();
        }

        List<Integer> unique = new ArrayList<Integer>();

        for (Integer num : nums) {
            if(!unique.contains(num)){
                unique.add(num);
            }
        }
        Collections.sort(unique);

        return unique;

    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        nums.add(5);

        List<Integer> result = deleteDublicates(nums);

        System.out.println(result);

    }
}
