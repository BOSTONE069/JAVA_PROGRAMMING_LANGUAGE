package week_four;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void test_createStudentWithValidArguments() {
        Student student = new Student(1, "John");
        assertNotNull(student);
        assertEquals(1, student.getRollNumber());
        assertEquals("John", student.getName());
    }

    @Test
    public void test_getRollNumber() {
        Student student = new Student(1, "John");
        assertEquals(1, student.getRollNumber());
    }

    @Test
    public void test_createStudentWithValidArguments_setRollNumberAndNameCorrectly() {
        Student student = new Student(1, "John");
        assertEquals(1, student.getRollNumber());
        assertEquals("John", student.getName());
    }

    @Test
    public void test_getName() {
        Student student = new Student(1, "John");
        assertEquals("John", student.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_createStudentWithNegativeRollNumber() {
        Student student = new Student(-1, "John");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_createStudentWithEmptyName_throwsIllegalArgumentException() {
        Student student = new Student(1, "");
    }



}