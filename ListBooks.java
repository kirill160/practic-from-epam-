package PracticJavaFromEpam.practicOOPJavaFromEpam.Book;

import java.util.ArrayList;
import java.util.List;

public class ListBooks {
    private List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }


    public void setBookList(List<Book> bookList) throws NullPointerException {
        if (bookList == null) {
            bookList = new ArrayList<>();
        }
        this.bookList = bookList;

        bookList.add(new Book("Не заставляйте меня думать", "Круг Стив", "Эксмо", 2017, 256, 856, "Мягкая обложка"));
        bookList.add(new Book("Мифический человек месяц, или Как создаются программные сети", "Брукс Фредерик", "Символ-Плюс", 2001, 304, 1687, "Твёрдый переплёт"));
        bookList.add(new Book("Примеры объектно-ориентированного проектирования", "Э. Гамма, Р. Хелм, Р. Джонсон, Дж. Влиссидес", "Питер", 2016, 366, 99, "Мягкая обложка"));
        bookList.add(new Book("Эффективная работа с унаследованным кодом", "Майкл К. Физерс", "Вильямс", 2016, 400, 200, "Твёрдый переплёт"));
        bookList.add(new Book("Чистый код. Создание, анализ и рефакторинг. Библиотека программиста", "Роберт Мартин", "Питер", 2019, 464, 899, "Мягкая обложка"));
        bookList.add(new Book("Совершенный код. Мастер-класс", " С. Макконнелл", " Русская Редакция,Microsoft Press", 2017, 896, 1653, "Твёрдый переплёт"));
        bookList.add(new Book("Путь программиста", "Джон Сонмез", "Питер", 2016, 448, 129, "мягкая обложка"));
        bookList.add(new Book("Алгоритмы. Построение и анализ", "Томас Кормен, Чарльз Лейзерсон, Рональд Ривест, Клиффорд Штайн", "Вильямс", 2018, 1328, 100, "Твердый переплет"));
        bookList.add(new Book("Кодеры за работой. Размышления о ремесле программиста", "Питер Сейбел", "Символ-Плюс", 2011, 544, 100, "Мягкая обложка"));
        bookList.add(new Book("Release it! Проектирование и дизайн ПО для тех, кому не все равно", "Нейгард Майкл", "Питер", 2016, 535, 499, "Мягкая обложка"));
        bookList.add(new Book("Глубокое обучение. Погружение в мир нейронных сетей", " С. Николенко, А. Кадурин, Е. Архангельская", "Питер", 2018, 480, 550, "Мягкая обложка"));
        bookList.add(new Book("Рефакторинг. Улучшение проекта существующего кода", " Бек Кент, Фаулер Мартин, Брант Джон", "Вильямс", 2017, 448, 3612, "Твердый переплет"));
        bookList.addAll(otherListBooks());

    }

    private List<Book> otherListBooks() {
        List<Book> otherListBooks = new ArrayList<>();

        Book bookOne = new Book("На пике. Как поддерживать максимальную эффективность без выгорания", "Брэд Сталберг, Стив Магнесс", "Манн, Иванов и Фербер");
        bookOne.setYearOfPublishing(2018);
        bookOne.setNumberOfPages(272);
        bookOne.setPrice(449);
        bookOne.setBindingType("Твердый переплет");

        Book bookTwo = new Book(" Программист-фанатик", "Чед Фаулер", "Питер");
        bookTwo.setYearOfPublishing(2019);
        bookTwo.setNumberOfPages(208);
        bookTwo.setPrice(749);
        bookTwo.setBindingType("Мягкая обложка");

        Book bookThree = new Book("Программирование без дураков", "Катрин Пассиг, Йоханнес Яндер", "Питер");
        bookThree.setYearOfPublishing(2017);
        bookThree.setNumberOfPages(416);
        bookThree.setPrice(100);
        bookThree.setBindingType("Мягкая обложка");

        otherListBooks.add(bookOne);
        otherListBooks.add(bookTwo);
        otherListBooks.add(bookThree);
        return otherListBooks;
    }

    public void printListBooksOfSetAuthor(String author) throws NullPointerException {
        if (author == null) {
            throw new NullPointerException("author is null");
        }
        for (Book book : getBookList()) {
            if (author.equals(book.getAuthor())) {
                System.out.println(book);
            }
        }
    }

    public void printListOfBooksPublishedByAGivenPublisher(String givenPublishingHouse) throws NullPointerException {
        if (givenPublishingHouse == null) {
            throw new NullPointerException("publishing house is null");
        }
        for (Book book : getBookList()) {
            if (givenPublishingHouse.equals(book.getPublishingHouse())) {
                System.out.println(book);
            }
        }
    }

    public void printListOfBooksReleasedAfterAGivenYear(int givenYear) {
        for (Book book : getBookList()) {
            if (book.getYearOfPublishing() > givenYear) {
                System.out.println(book);
            }
        }

    }
}
