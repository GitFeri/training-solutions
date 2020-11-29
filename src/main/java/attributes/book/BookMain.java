package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Összes regény");

        System.out.println(book.getTitle());
        book.setTitle("Másik cím");
        System.out.println(book.getTitle());
    }
}
