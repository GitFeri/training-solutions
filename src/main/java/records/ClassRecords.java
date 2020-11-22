package records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private final String className;
    private final Random rnd;
    private final List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        for (Student std : students) {
            if (std.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double averages = 0.0;
        int averageCount = 0;
        double studentAverage;
        for (Student student : students) {
            studentAverage = student.calculateSubjectAverage(subject);
            if (studentAverage != 0.0) {
                averages += studentAverage;
                averageCount++;
            }
        }
        if (averageCount == 0) {
            return 0.0;
        } else {
            return (double) (Math.round(100.0 * averages / averageCount)) / 100;
        }
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    private boolean isEmpty(String s) {
        return (s == null || "".equals(s));
    }

    public String listStudentNames() {
        String result = "";
        for (Student student : students) {
            if (!isEmpty(result)) {
                result += ", ";
            }
            result += student.getName();

        }
        return result;
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> list = new ArrayList<>();
        for (Student student : students) {
            list.add(new StudyResultByName(student.calculateAverage(), student.getName()));
        }
        return list;
    }

    public boolean removeStudent(Student student) {
        try {
            Student std = findStudentByName(student.getName());
            if (std != null) {
                students.remove(std);
                return true;
            }

        } catch (IllegalArgumentException err) {
            return false;
        }
        return false;
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");

        }
        double marksSum = 0;
        int marksCount = 0;
        for (Student student : students) {
            marksSum += student.calculateAverage();
            marksCount++;
        }
        if (marksCount == 0 || marksSum == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        } else {
            return (double) (Math.round(100.0 * marksSum / marksCount)) / 100;
        }
    }
}

