package intro_to_java;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main (String[] args){

        LinkedList<String> namesLinkedList = new LinkedList<>();

        namesLinkedList.add("Bostone");
        namesLinkedList.add("Lucy");
        namesLinkedList.add("Kevin");
        namesLinkedList.add("Linda");

        System.out.println(namesLinkedList.get(2));


        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Vivian");
        namesArrayList.add("Linda");
        namesArrayList.add("Reuben");

        System.out.println(namesArrayList.get(1));
        

    }

    
}
