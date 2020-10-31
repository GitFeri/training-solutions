package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();

        note.setName("Jonh Done");
        note.setTopic("Jegyzet");
        note.setText("Ez maga a hosszúúúúúú jegyzet. :-)");

        System.out.println(note.getNoteText());
    }

}
