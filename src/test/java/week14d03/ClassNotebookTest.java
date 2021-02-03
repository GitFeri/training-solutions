package week14d03;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    ClassNotebook classNotebook = new ClassNotebook();

    @BeforeEach
    void setUp(){
        Student john = new Student("John");
        john.addMark("math", 4);
        john.addMark("math", 5);
        john.addMark("math", 5);
        classNotebook.addStudent(john);

        Student joe = new Student("Joe");
        joe.addMark("biology", 5);
        joe.addMark("biology", 4);
        joe.addMark("math", 4);
        classNotebook.addStudent(joe);

        Student bill = new Student("Bill");
        classNotebook.addStudent(bill);

    }

    @Test
    void addStudentTest() {

        assertEquals(3, classNotebook.getStudents().size());
    }

    @Test
    void sortNotebookTest() {
        assertEquals("Bill",classNotebook.sortNotebook().get(0).getName());
    }
}