package epam.practic.edition.tutorial;

import epam.practic.edition.exception.EditionFactoryNotFound;
import epam.practic.edition.printing.EditionFactory;

public class Tutorial extends EditionFactory {

    public Tutorial(String name, int numberOfPages) {
        super(name, numberOfPages);
    }

    protected Tutorial() {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public EditionFactory createEdition() {
        return new Tutorial();
    }

    @Override
    public boolean isExecutionOfContract() {
        return true;
    }

    @Override
    public void open() throws EditionFactoryNotFound {
        super.open();
        System.out.println("Издание " + getName() + " отккрыто" );
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
        return "Tutorial{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
