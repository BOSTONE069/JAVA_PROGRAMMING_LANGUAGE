import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerArrayListSum {
    public static void main(String[] args) {
        // Create an ArrayList of Integer numbers
        List<Integer> integerList = new ArrayList<>();

        // Populate the ArrayList with some Integer values
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);

        // Calculate and print the sum of the numbers
        int sum = sumNumbers(integerList);
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to calculate the sum of Integer numbers in the ArrayList
    public static int sumNumbers(List<Integer> numbers) {
        int sum = 0;

        // Using an iterator to traverse the ArrayList
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }

        return sum;
    }
}
