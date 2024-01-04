package week_four;

import java.util.Arrays;
import java.util.List;


public class StreamMapMethod {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5", "6");

        //map method
        List<Integer> listOfInteger = listOfStrings.stream()
                .map(Integer::valueOf).toList();

    //Count method
        long total = listOfStrings.stream().count();

        System.out.println(listOfInteger);
        System.out.println(total);
    }
}
