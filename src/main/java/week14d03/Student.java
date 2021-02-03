package week14d03;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private Map<String, List<Integer>> marksBySubject = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getMarksBySubject() {
        return marksBySubject;
    }

    public void addMark(String subject, int mark) {

        if (!marksBySubject.containsKey(subject)) {
            marksBySubject.put(subject, new ArrayList<>());
        }

        marksBySubject.get(subject).add(mark);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}


