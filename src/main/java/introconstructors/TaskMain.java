package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("feladat címe","leírás");

        task.start();

        System.out.println(task.getStartDateTime());
    }
}
