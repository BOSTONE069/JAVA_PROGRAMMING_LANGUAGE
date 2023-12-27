package week_three;
import java.util.List;
import java.util.ArrayList;
public class convertArrayToList {
    //Create a new ArrayList of String.
    //Iterate through the inputArray using a for-each loop.
    //Store each element of inputArray in the ArrayList created in step 1 through iteration.
    //Return the new list with the elements.
    public static List<String> convertArrayToList(String[] inputArray) {
        List<String> list = new ArrayList<>();
        for (String s : inputArray) {
            list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Benz"};
        System.out.println(convertArrayToList(cars));
    }
}
