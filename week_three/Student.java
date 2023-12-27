package week_three;

public class Student {
	
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
