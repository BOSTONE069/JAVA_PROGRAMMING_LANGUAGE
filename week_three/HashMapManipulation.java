package week_three;


import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {
    public static void main(String[] args) {
        //Create a HashMap object, named map and use the put() method to add key-value pairs to the map.
        //The keys are strings A, B, and C, and the values are integers 1, 2, and 3 respectively.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        //Use the size() method to print the size of the map.
        System.out.println("Size of the map: " + map.size());

        //Use a for-each loop to print the key-value pairs in the map.
        //The loop should iterate over the entries in the map using the entrySet() method,
        //which will return a set of Map.Entry objects representing the key-value pairs in the map.
        //The key and value of each entry are fetched using the getKey() and getValue() methods, respectively.
        //Print out each map entry using the format: "Key: key, Value: value ".
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //Use the get() method to get the value of the key A, and assign it to a variable called value.
        //Then, print value to the console using the format: "Value of key 'A': value ".
        int value = map.get("A");
        System.out.println("Value of key 'A': " + value);

        //Use the put() method to add a new key-value pair to the map.
        //The key is D and the value is 4.
        map.put("D", 4);

        //Print out the map again to show the added key-value pair reusing the code in step 5.
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //Use the containsKey() method to check if the key C exists in the map
        //and print "Key 'C' exists in the map" if C exists.
        if (map.containsKey("C")) {
            System.out.println("Key 'C' exists in the map");
        }
    }
}