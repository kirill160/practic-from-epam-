package PracticJavaFromEpam.practicOOPJavaFromEpam.Book;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        ListBook l = new ListBook();
        l.setBookList(null);
        System.out.println(l.filterListIssuedAfterAGivenYear(2017));

    }
}
