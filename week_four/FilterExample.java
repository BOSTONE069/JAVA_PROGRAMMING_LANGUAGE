package week_four;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .toList();

        System.out.println("Filtered fruits: " + filteredFruits);
    }
}
