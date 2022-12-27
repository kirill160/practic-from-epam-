package PracticJavaFromEpam.practicOOPJavaFromEpam.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Создать классы, спецификации которых приведены ниже. Определить кон-
структоры и методы setТип(), getТип(), toString(). Определить дополнительно
методы в классе, создающем массив объектов. Задать критерий выбора данных
и вывести эти данные на консоль. В каждом классе, обладающем информацией,
должно быть объявлено несколько конструкторов.
5. Book: id, Название, Автор(ы), Издательство, Год издания, Количество
страниц, Цена, Тип переплета.
Создать массив объектов. Вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Book {
    private static int count = 0;
    private int id = count++;
    private String nameOfTheBook;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public Book(String nameOfTheBook, String author, String publishingHouse) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publishingHouse = publishingHouse;
    }

    public Book(String nameOfTheBook,String author, String publishingHouse, int yearOfPublishing, int numberOfPages, int price, String bindingType) {
        this(nameOfTheBook, author, publishingHouse);
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public Book() {

    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameOfTheBook='" + nameOfTheBook + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing + " года" +
                ", numberOfPages=" + numberOfPages + " страниц" +
                ", price=" + price + " рублей" +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
