package week_four;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberListTest {

    @Test
    public void test_filterEvenNumbers() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> evenNumberList = list.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        assertEquals(expected, evenNumberList);
    }

    @Test
    public void test_emptyList() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        List<Integer> evenNumberList = list.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        assertEquals(expected, evenNumberList);
    }

    @Test
    public void test_oddNumbersOnly() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> expected = new ArrayList<>();

        List<Integer> evenNumberList = list.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        assertEquals(expected, evenNumberList);
    }

    @Test
    public void test_largeInputList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }
        List<Integer> expected = new ArrayList<>();
        for (int i = 2; i <= 1000000; i += 2) {
            expected.add(i);
        }

        List<Integer> evenNumberList = list.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        assertEquals(expected, evenNumberList);
    }

}