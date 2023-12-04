package intro_to_java;

public class Student extends Person2 {

    public Student(String name) {
        super(name);
    }

    public String getName() {
        String output = super.getFood();
        return output + " and Taco";
    }

    
}