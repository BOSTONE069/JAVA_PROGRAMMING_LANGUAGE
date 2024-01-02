package week_four;

public class Student {

    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        if (rollNumber <= 0) {
            throw new IllegalArgumentException("Roll number must be greater than 0");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}
