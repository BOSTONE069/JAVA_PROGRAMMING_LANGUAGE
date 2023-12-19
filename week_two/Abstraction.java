package week_two;

abstract class newPerson {
    private String name;
    private String country;

    // Constructor for Person class
    public newPerson(String name, String country) {
        this.setName(name);
        this.setCountry(country);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }
}

class Student extends newPerson {

    // Constructor for Student class
    public Student(String name, String country) {
        // Calling the superclass constructor (Person class)
        super(name, country);
    }
}

public class Abstraction {

    public static void main(String[] args) {
        // Creating instances of Student
        Student firstStudent = new Student("Bostone", "Kenya");
        Student secondStudent = new Student("Joy", "Kenya");

        // Printing information of first student
        System.out.println("First Student:");
        System.out.println("Name: " + firstStudent.getName());
        System.out.println("Country: " + firstStudent.getCountry());

        // Printing information of second student
        System.out.println("\nSecond Student:");
        System.out.println("Name: " + secondStudent.getName());
        System.out.println("Country: " + secondStudent.getCountry());
    }
}

