package epam.practic.edition.book;

import epam.practic.edition.exception.EditionFactoryNotFound;
import epam.practic.edition.printing.EditionFactory;



public class Book extends EditionFactory {

    public Book(String name, int numberOfPages) {
        super(name, numberOfPages);
    }
    public Book() {

        super();
    }

    @Override
    protected EditionFactory createEdition() {
        return new Book();
    }

    @Override
    public boolean isExecutionOfContract() {
        return true;
    }

    @Override
    public void open() throws EditionFactoryNotFound {
        super.open();
        System.out.println("Книга " + getName() + " открыта" );
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void typeset() {
        super.typeset();
    }

    @Override
    public void layoutThePublications() {
        super.layoutThePublications();
    }

    @Override
    public void sendToPrint() {
        super.sendToPrint();
    }

    @Override
    public void refuseToPublish() {
        super.refuseToPublish();
    }

    @Override
    public void resume() throws EditionFactoryNotFound {
        super.resume();
    }

    @Override
    public void closeThePublication() throws EditionFactoryNotFound {
        super.closeThePublication();
    }

    @Override
    public void show() throws EditionFactoryNotFound {
        super.show();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
