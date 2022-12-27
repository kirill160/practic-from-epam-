package PracticJavaFromEpam.practicOOPJavaFromEpam.Book;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        ListBooks l = new ListBooks();
        l.setBookList(null);
        l.printListOfBooksReleasedAfterAGivenYear(2001);
        //l.printListBooksOfSetAuthor("Круг Стив");
    }
}
