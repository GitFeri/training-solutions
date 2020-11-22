package records;

public class StudyResultByName {
    private final String studentName;
    private final double studyAverage;

    public StudyResultByName(double studyAverage, String studentName) {
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }
}
