package week_three;

import java.util.ArrayList;

public class StudentList {

    /**
 * This code demonstrates the usage of an ArrayList to store a list of Student objects.
 * It creates a roster of students, prints the total number of students, and then
 * prints each student's details. Finally, it prints the entire roster.
 */

public static void main(String[] args){
    ArrayList<Student> roster = new ArrayList<Student>();
    roster.add(new Student("William", "willian@gmail.com", 20));
    roster.add(new Student("John", "john@gmail.com", 21));
    roster.add(new Student("Velma", "joy@gmail.com", 22));
    roster.add(new Student("Joy", "joy@gmail.com", 23));
    System.out.println("The roster has " + roster.size() + " students.");
    for (Student student : roster) {
        System.out.println(student);
    }
    System.out.println(roster);
}
}
