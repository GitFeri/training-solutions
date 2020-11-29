package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        /******************************************************************/

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book5;
        book5 = new Book();
        book6 = null;

        /*
        4 opbjektum jött létre. (new)
        Mind a 4-hez hozzá lehet férni: book1, book2, book3, book5
         */

        /**********************************************************************/

        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> bookList1 = new ArrayList<>();

        bookList1.add(new Book());
        bookList1.add(new Book());
        bookList1.add(new Book());

        System.out.println(bookList.size());
        System.out.println(bookList1.size());

    }
}
