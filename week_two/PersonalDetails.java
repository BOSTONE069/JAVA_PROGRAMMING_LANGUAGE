package week_two;

public class PersonalDetails {
	
	private String name;
	
	public PersonalDetails(String theName) {
		this.setName(theName);
	}

	public String getName() {
		return name;
	}

	public boolean setName(String theNewName) {
		if(theNewName != null) {
			this.name = theNewName;
			return true;
		}
		return false;
	}

}
