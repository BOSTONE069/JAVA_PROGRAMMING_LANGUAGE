package week_four;

public class StudentSearch {

    public static Student searchStudent(Student[] students, int rollNumber){

        for(Student student : students){

            if(student.getRollNumber() == rollNumber){
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create an array of five students
        Student[] students = new Student[5];
        students[0] = new Student(101, "John");
        students[1] = new Student(102, "Alice");
        students[2] = new Student(103, "Bob");
        students[3] = new Student(104, "Emily");
        students[4] = new Student(105, "Mike");

        // Declare an integer variable targetRollNumber and assign it a value
        int targetRollNumber = 103;

        // Call the searchStudent method, passing the students array and targetRollNumber as arguments
        // and save the return value to the targetStudent variable
        Student targetStudent = searchStudent(students, targetRollNumber);

        // Check if student is found or not. If found print name and roll number
        // and if not then print a message which says student not found
        if (targetStudent != null) {
            System.out.printf("Student found:%nRoll Number: %d%nName: %s%n", targetStudent.getRollNumber(), targetStudent.getName());
        } else {
            System.out.println("Student not found!");
        }
    }
}
