package week_four;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void test_returns_minus_one_if_element_does_not_exist() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int key = 6;

        int result = BinarySearch.binarySearch(list, key);

        assertEquals(-1, result);
    }

    @Test
    public void test_works_with_list_of_size_one() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        int key = 1;

        int result = BinarySearch.binarySearch(list, key);

        assertEquals(0, result);
    }

    @Test
    public void test_returns_minus_one_when_list_is_empty() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int key = 1;

        int result = BinarySearch.binarySearch(list, key);

        assertEquals(-1, result);
    }

    @Test
    public void test_returns_minus_one_when_target_is_less_than_first_element() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int key = 1;

        int result = BinarySearch.binarySearch(list, key);

        assertEquals(-1, result);
    }

    @Test
    public void test_returns_minus_one_when_target_is_greater_than_last_element() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int key = 5;

        int result = BinarySearch.binarySearch(list, key);

        assertEquals(-1, result);
    }

}