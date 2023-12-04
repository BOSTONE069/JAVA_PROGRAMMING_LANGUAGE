package intro_to_java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayListSum<T extends Number> {
    public static void main(String[] args) {
        // Create an ArrayList of Integer numbers
        List<Integer> integerList = new ArrayList<>();

        // Populate the ArrayList with some Integer values
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);

        // Calculate and print the sum of the integers
        int integerSum = sumNumbers(integerList);
        System.out.println("Sum of integers: " + integerSum);

        // Create an ArrayList of Double numbers
        List<Double> doubleList = new ArrayList<>();

        // Populate the ArrayList with some Double values
        doubleList.add(2.5);
        doubleList.add(3.5);
        doubleList.add(4.0);

        // Calculate and print the sum of the doubles
        double doubleSum = sumNumbers(doubleList);
        System.out.println("Sum of doubles: " + doubleSum);
    }

    // Method to calculate the sum of numbers in a generic List
    public static <T extends Number> T sumNumbers(List<T> numbers) {
        double sum = 0.0;

        // Using an iterator to traverse the ArrayList
        Iterator<T> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            T num = iterator.next();
            sum += num.doubleValue(); // Convert to double for summation
        }

        // Determine the return type based on the input list's type
        if (numbers.isEmpty()) {
            return null; // Return null if the list is empty
        } else if (numbers.get(0) instanceof Integer) {
            return (T) Integer.valueOf((int) sum);
        } else if (numbers.get(0) instanceof Double) {
            return (T) Double.valueOf(sum);
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }
}
