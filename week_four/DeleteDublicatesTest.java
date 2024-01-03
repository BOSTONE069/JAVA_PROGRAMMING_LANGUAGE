package week_four;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDublicatesTest {

    @Test
    //Returns an empty list when given an empty list
    public void test_empty_list() {
        List<Integer> nums = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();

        List<Integer> result = DeleteDublicates.deleteDublicates(nums);

        assertEquals(expected, result);
    }

    @Test
    //Returns a list with unique elements sorted in ascending order
    public void test_unique_elements_sorted() {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(1);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        List<Integer> result = DeleteDublicates.deleteDublicates(nums);

        assertEquals(expected, result);
    }

    @Test
    //Returns the same list when given a list with no duplicates
    public void test_no_duplicates() {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        List<Integer> result = DeleteDublicates.deleteDublicates(nums);

        assertEquals(expected, result);
    }

    @Test
    //Returns a list with one element when given a list with all duplicates
    public void test_all_duplicates() {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);

        List<Integer> result = DeleteDublicates.deleteDublicates(nums);

        assertEquals(expected, result);
    }

    @Test
    //Returns a list with two elements when given a list with two duplicates
    public void test_two_duplicates() {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        List<Integer> result = DeleteDublicates.deleteDublicates(nums);

        assertEquals(expected, result);
    }



}