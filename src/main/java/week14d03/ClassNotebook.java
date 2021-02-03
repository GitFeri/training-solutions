package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> students = new ArrayList<>();

    public ClassNotebook() {
    }

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortNotebook() {
        List<Student> result = new ArrayList<>(students);
        Collections.sort(result);
        return result;
    }
}
