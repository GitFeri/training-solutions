package objects;

public class ObjectsMain {

    public static void main(String[] args) {
        new Book();

        System.out.println(new Book());

        Book emptyBook;

//        System.out.println(emptyBook);

        emptyBook = null;

        System.out.println(emptyBook == null);

        emptyBook = new Book();

        System.out.println(emptyBook);

        Book anotherBook = new Book();

        System.out.println(emptyBook == anotherBook);

        anotherBook = emptyBook;

        System.out.println(emptyBook == anotherBook);

        System.out.println(anotherBook instanceof Book);

    }
}
