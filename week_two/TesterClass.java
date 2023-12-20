package week_two;

public class TesterClass {
	   // main method for testing
	   public static void main(String[] args) {
		   personDetailInformation s1 = new personDetailInformation("Skyler", "skyler@sky.com", 123456);
	      System.out.println(s1);
	      s1.setName("Skyler 2");
	      
	      // Main doesn't have access to email, use set method!
	      s1.setEmail("skyler2@gmail.com");
	      System.out.println(s1);
	   }
}

class personDetailInformation {
	   private String name;
	   private String email;
	   private int id;

	   public personDetailInformation(String initName, String initEmail, int initId) {
	      name = initName;
	      email = initEmail;
	      id = initId;
	   }
	   // mutator methods - setters
	   public void setName(String newName) {
	     name = newName;
	   }
	   public void setEmail(String newEmail) {
	     email = newEmail;
	   }
	   public void setId(int newId) {
	     id = newId;
	   }
	   // accessor methods - getters
	   public String getName() {
	      return name;
	   }
	   public String getEmail() {
	      return email;
	   }
	   public int getId() {
	      return id;
	   }
	   public String toString() {
	      return id + ": " + name + ", " + email;
	   }
}

