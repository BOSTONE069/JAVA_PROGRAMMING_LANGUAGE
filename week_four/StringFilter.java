package week_four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilter {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

        String characterFilter = "e";

        System.out.println("List before filter" + list);

        list.removeIf(str -> str.indexOf(characterFilter) != -1);

        System.out.println("List after filter" + list);
    }
}
