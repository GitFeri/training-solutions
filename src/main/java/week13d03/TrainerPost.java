package week13d03;

public class TrainerPost {
    private String name;
    private String subject;
    private String classType;
    private int sumOfClass;

    public TrainerPost(String name, String subject, String classType, int sumOfClass) {
        this.name = name;
        this.subject = subject;
        this.classType = classType;
        this.sumOfClass = sumOfClass;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassType() {
        return classType;
    }

    public int getSumOfClass() {
        return sumOfClass;
    }
}

