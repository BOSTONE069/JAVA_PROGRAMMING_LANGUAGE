import java.util.LinkedList;

public class LinkedListExample {

    public static void main (String[] args){

        LinkedList<String> namesLinkedList = new LinkedList<>();

        namesLinkedList.add("Bostone");
        namesLinkedList.add("Lucy");
        namesLinkedList.add("Kevin");
        namesLinkedList.add("Linda");

        System.out.println(namesLinkedList.get(2));

    }

    
}
