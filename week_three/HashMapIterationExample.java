package week_three;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Iterating over the HashMap using an enhanced for-loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
