package week_three;

public class Student {
	
	/**
 * This is a Java program that defines a Student class with private variables for name, email, and id.
 * It includes a constructor to initialize the variables and a toString() method to return a string representation of the Student object.
 */
private String name;
private String email;
private int id;

public Student(String initName, String initEmail, int initId){
    this.name = initName;
    this.email = initEmail;
    this.id = initId;
}

    public String toString(){
        return "Name: " + name + " Email: " + email + " ID: " + id;
    }



}
