package week_four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EvenNumberList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> evenNumberList = filterEvenNumbers(list);

        System.out.println("The original List: " + list);

        System.out.println("The new List: " + evenNumberList);
    }

    private static List<Integer> filterEvenNumbers(List<Integer> list) {
    if (list == null) {
        throw new IllegalArgumentException("Input list cannot be null");
    } else {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }
}
}
