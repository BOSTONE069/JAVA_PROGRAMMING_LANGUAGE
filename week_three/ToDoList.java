package week_three;

import java.util.ArrayList;

public class ToDoList {

    public static void main(String[] args) {

        // create a to do list
        // add 3 items
        // print the list
        // remove the first item
        // print the list
        // create a to do list
        ArrayList<String> todoList = new ArrayList<>();
        // add 3 items
        todoList.add("Do homework");
        todoList.add("Help mak dinner");
        todoList.add("Call grandma");

        todoList.set(1, "Oder the pizza");
        // print the list
        System.out.println(todoList.size() + " things to to do!");
        // remove the first item
        todoList.remove(0);
        // print the list
        System.out.println(todoList);
    }
}
