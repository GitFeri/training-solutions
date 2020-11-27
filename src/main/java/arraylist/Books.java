package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    ArrayList<String> titleOfBooks = new ArrayList<>();

    public void add(String title) {
        titleOfBooks.add(title);
    }

    List<String> findAllByPrefix(String prefix) {
        List<String> titles = new ArrayList<>();
        for (String title : titleOfBooks) {
           if (title.startsWith(prefix)) {
               titles.add(title);
            }
        }
        return titles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Arany összes");
        books.add("Petőfi összes");
        books.add("Arany első kötet");
        books.add("Petőfi első kötet");

//      System.out.println(books.titleOfBooks.toString());

        System.out.println(books.findAllByPrefix("Arany"));

    }
}
