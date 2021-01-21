package schoolrecords;

import java.util.*;
import java.util.List;

public class SchoolRecordsController {
    private ClassRecords classRecords = new ClassRecords("1a", new Random());
    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initSchool();

        Menus menu;
        do {
            menu = schoolRecordsController.menu();

            switch (menu) {
                case LIST_STUDENT_NAMES:
                    schoolRecordsController.listStudentNames();
                    break;
                case FIND_STUDENT_BY_NAME:
                    schoolRecordsController.findStudentByName();
                    break;
                case ADD_STRUDENT_BY_NAME:
                    schoolRecordsController.addStudentByName();
                    break;
                case DEL_STUDENT_BY_NAME:
                    schoolRecordsController.removeStudentByName();
                    break;
                case TEST_STUDENT_BY_REPETITION:
                    schoolRecordsController.testStudentByRepetition();
                    break;
                case CALCULATE_CLASS_AVERAGE:
                    schoolRecordsController.calculateClassAverage();
                    break;
                case CALCULATE_CLASS_AVERAGE_BY_SUBJECT:
                    schoolRecordsController.calculateClassAverageBySubject();
                    break;
                case LIST_STUDENT_BY_NAME:
                    schoolRecordsController.listStudentResultByName();
                    break;
                case CALCULATE_AVERAGE_BY_NAME:
                    schoolRecordsController.calculateAverageByName();
                    break;
                case CALCULATE_SUBJECT_AVERAGE_BY_NAME:
                    schoolRecordsController.calculateSubjectAverageByName();
                    break;
                case LIST_TUTOR:
                    schoolRecordsController.listTutor();
                    break;
                case LIST_SUBJECT:
                    schoolRecordsController.listSubject();
                    break;
            }
        } while (menu != Menus.EXIT);

    }

    public void initSchool() {
        subjects.add(new Subject("történelem"));
        subjects.add(new Subject("földrajz"));
        subjects.add(new Subject("matematika"));
        subjects.add(new Subject("biológia"));
        subjects.add(new Subject("zene"));
        subjects.add(new Subject("fizika"));
        subjects.add(new Subject("kémia"));

        tutors.add(new Tutor("Nagy Csilla", Arrays.asList(
                new Subject("matematika"),
                new Subject("kémia"),
                new Subject("fizika"))));
        tutors.add(new Tutor("Kovács Péter", Arrays.asList(
                new Subject("történelem"),
                new Subject("földrajz"))));
        tutors.add(new Tutor("Szabó Zoltán", Arrays.asList(
                new Subject("biológia"),
                new Subject("zene"))));
    }

    public Menus menu() {
        int menuNum;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n\n       Menü\n");
            for (Menus menu : Menus.values()) {
                System.out.println(menu);
            }
            System.out.print("\n\n választás: ");
            try {
                menuNum = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                menuNum = 0;
            }
            for (Menus menu : Menus.values()) {
                if (menuNum == menu.value) {
                    System.out.println("\nVálasztott menü : " + menu);
                    char[] chars = new char[18 + menu.toString().length()];
                    Arrays.fill(chars, '-');
                    System.out.println(chars);
                    return menu;
                }
            }
        }
    }

    public void listStudentNames() {
        System.out.println(classRecords.listStudentNames());
    }

    public void findStudentByName() {
        try {
            System.out.println(inputStudent());
        } catch (IllegalStateException err) {
            System.out.println("Nincs még egy diák sem.");
        } catch (IllegalArgumentException err) {
        }
    }

    public void addStudentByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a diák nevét : ");
        String std = scanner.nextLine();
        try {
            classRecords.addStudent(new Student(std));
        } catch (IllegalArgumentException err) {
        }
    }

    public void removeStudentByName() {
        try {
            classRecords.removeStudent(inputStudent());
        } catch (IllegalStateException err) {
            System.out.println("Nincs még egy diák sem.");
        } catch (IllegalArgumentException err) {
        }

    }

    public void testStudentByRepetition() {
        Student student;
        MarkType mark = null;

        try {
            student = classRecords.repetition();
        } catch (IllegalStateException err) {
            System.out.println("Még nincs diák az osztályban.");
            return;
        }
        System.out.println("A következő diák felel : " + student.getName() + "\n");
        Scanner scanner = new Scanner(System.in);

        int markValue = 0;
        while (markValue <= 0) {
            System.out.print("Adja meg az érdemjegyet (0-kilép) : ");
            try {
                markValue = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                markValue = -1;
            }
            if (markValue == 0) {
                return;
            }
            if (markValue < 1 || markValue > 5) {
                System.out.println("Hibás érték");
                markValue = -1;
            }
        }
        for (MarkType markType : MarkType.values()) {
            if (markType.getValue() == markValue) {
                mark = markType;
            }
        }


        String selectedSubjectName = "";
        Subject selectedSubject = null;
        while ("".equals(selectedSubjectName)) {
            System.out.print("Adja meg a tantágyat    : ");
            String subjectName = scanner.nextLine();
            if ("".equals(subjectName)) {
                return;
            }

            for (Subject subject : subjects) {
                if (subject.getSubjectName().equals(subjectName)) {
                    selectedSubjectName = subjectName;
                    selectedSubject = subject;
                }
            }
            if ("".equals(selectedSubjectName)) {
                System.out.println("nincs ilyen tantárgy!\n");
            }
        }

        Tutor selectedTutor;
        try {
            selectedTutor = inputTutor();
        } catch (NullPointerException err) {
            return;
        }

        if (selectedSubject != null && selectedTutor != null) {
            student.grading(new Mark(mark, selectedSubject, selectedTutor));
        }
    }

    public void calculateClassAverage() {
        try {
            System.out.println("Az osztály átlaga : " + classRecords.calculateClassAverage());
        } catch (ArithmeticException err) {
            System.out.println("Még nem volt egyetlen osztályzat sem.");
        }
    }

    public void calculateClassAverageBySubject() {
        try {
            System.out.println("Az osztály átlaga : " + classRecords.calculateClassAverageBySubject(inputSubject()));
        } catch (ArithmeticException err) {
            System.out.println("Még nem volt egyetlen osztályzat sem.");
        } catch (NullPointerException err) {
            System.out.println("Nullpointer");
        }
    }

    public void listStudentResultByName() {
        for (int i = 0; i < classRecords.listStudyResults().size(); i++) {
            System.out.println(classRecords.listStudyResults().get(i).getStudentName() + " " +
                    classRecords.listStudyResults().get(i).getStudyAverage());
        }
    }

    public void calculateAverageByName() {
        try {
            Student student = inputStudent();
            double average = student.calculateAverage();
            if (average == 0.0) {
                System.out.println("Még nem volt osztályzat.");
            } else {
                System.out.println("Átlag : " + average);
            }
        } catch (IllegalStateException err) {
            System.out.println("Nem található ilyen nevű diák.");
        } catch (IllegalArgumentException err) {

        }

    }

    public void calculateSubjectAverageByName() {
        try {
            Student student = inputStudent();
            Subject subject = inputSubject();
            System.out.println("Tantárgy átlaga : " + student.calculateSubjectAverage(subject));
        } catch (IllegalStateException err) {
            System.out.println("Még nincs egy diák sem.");
        } catch (IllegalArgumentException err) {

        }
    }

    public Subject inputSubject() {
        Scanner scanner = new Scanner(System.in);
        String selectedSubjectName = "";
        while ("".equals(selectedSubjectName)) {
            System.out.print("Adja meg a tantágyat    : ");
            String subjectName = scanner.nextLine();
            if ("".equals(subjectName)) {
                return null;
            }

            for (Subject subject : subjects) {
                if (subject.getSubjectName().equals(subjectName)) {
                    return subject;
                }
            }

            if ("".equals(selectedSubjectName)) {
                System.out.println("nincs ilyen tantárgy!\n");
                selectedSubjectName = "";
            }
        }
        return null;
    }

    public Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        String studentName = "";
        Student student = null;
        while ("".equals(studentName)) {
            System.out.print("Adja meg a diák nevét : ");
            studentName = scanner.nextLine();
            student = classRecords.findStudentByName(studentName);
        }
        return student;
    }

    public Tutor inputTutor() {
        Scanner scanner = new Scanner(System.in);
        String tutorName = "";
        while ("".equals(tutorName)) {
            System.out.print("Adja meg a tanár nevét : ");
            tutorName = scanner.nextLine();

            for (Tutor tutor : tutors) {
                if (tutor.getName().equals(tutorName)) {
                    return tutor;
                }
            }
        }
        System.out.println("Nincs ilyen nevű tanár.");
        return null;
    }

    public void listTutor() {
        for (Tutor tutor : tutors) {
            System.out.println(tutor.getName());
        }
    }

    public void listSubject() {
        for (Subject subject : subjects) {
            System.out.println(subject.getSubjectName());
        }
    }

    private enum Menus {
        LIST_STUDENT_NAMES(1, "Diákok nevének listázása"),
        FIND_STUDENT_BY_NAME(2, "Diák név alapján keresése"),
        ADD_STRUDENT_BY_NAME(3, "Diák létrehozása"),
        DEL_STUDENT_BY_NAME(4, "Diák név alapján törlése"),
        TEST_STUDENT_BY_REPETITION(5, "Diák feleltetése"),
        CALCULATE_CLASS_AVERAGE(6, "Osztályátlag kiszámolása"),
        CALCULATE_CLASS_AVERAGE_BY_SUBJECT(7, "Tantárgyi átlag kiszámolása"),
        LIST_STUDENT_BY_NAME(8, "Diákok átlagának megjelenítése"),
        CALCULATE_AVERAGE_BY_NAME(9, "Diák átlagának kiírása"),
        CALCULATE_SUBJECT_AVERAGE_BY_NAME(10, "Diák tantárgyhoz tartozó átlagának kiírása"),
        LIST_TUTOR(11, "Tanárok listázása"),
        LIST_SUBJECT(12, "Tantárgyak listázása"),
        EXIT(13, "Kilépés");

        private final int value;
        private final String menuText;

        Menus(int value, String menuText) {
            this.value = value;
            this.menuText = menuText;
        }

        public int getValue() {
            return value;
        }

        public String getMenuText() {
            return menuText;
        }

        @Override
        public String toString() {
            return value + ". " + menuText;
        }
    }
}
