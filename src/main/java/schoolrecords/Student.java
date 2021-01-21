package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final List<Mark> marks = new ArrayList<>();
    String name;

    public Student(String name) {
        if (isEmpty(name))
            throw new IllegalArgumentException("Student name must not be empty!");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(name + " marks: ");
         for (Mark mark : marks) {
            stringBuilder.append(mark.getSubject().getSubjectName()).append(": ").append(mark.toString());
        }
        return stringBuilder.toString();
    }

    public double calculateAverage() {

        int marksSum = 0;
        int marksCount = 0;
        for (Mark mark : marks) {
            marksSum += mark.getMarkType().getValue();
            marksCount++;
        }

        if (marksCount == 0) {
            return 0.0;
        } else {
            return (double) (Math.round(100.0 * marksSum / marksCount)) / 100;
        }
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateSubjectAverage(Subject subject) {
        int marksSum = 0;
        int marksCount = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                marksSum += mark.getMarkType().getValue();
                marksCount++;
            }
        }
        if (marksCount == 0) {
            return 0.0;
        } else {
            return (double) (Math.round(100.0 * marksSum / marksCount)) / 100;
        }
    }

    private boolean isEmpty(String string) {
        return (string == null || "".equals(string));
    }
}
