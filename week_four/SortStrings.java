package week_four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStrings {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("foo", "bar", "baz", "qux", "quux"));

        System.out.println("Lists before sorting" + strings);

        strings.sort(String::compareTo);

        System.out.println("Lists after sorting" + strings);


    }
}
