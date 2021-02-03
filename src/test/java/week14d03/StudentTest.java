package week14d03;

import org.junit.jupiter.api.Test;
import week14d03.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void addMarkTest() {
        Student student = new Student("John Doe");
        student.addMark("math",5);
        student.addMark("math",4);
        student.addMark("math",5);

        assertEquals("John Doe",student.getName());
        assertEquals(1,student.getMarksBySubject().size());
        assertEquals(5,student.getMarksBySubject().get("math").get(0));
        assertEquals(4,student.getMarksBySubject().get("math").get(1));


    }
}