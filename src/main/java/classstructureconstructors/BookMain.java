package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Szerző","Cím");
        book.register("123456");

        System.out.println("Szerző: " + book.getAuthor());
        System.out.println("Cím   : " + book.getTitle());
        System.out.println("Regnum: " + book.getRegNumber());
    }
}
