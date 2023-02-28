package epam.practic.edition.actionable;

import epam.practic.edition.exception.EditionFactoryNotFound;
import epam.practic.edition.printing.EditionFactory;

public interface Actionable {
    boolean isExecutionOfContract();
    void open() throws EditionFactoryNotFound;
    void edit();
    void typeset();
    void layoutThePublications();
    void sendToPrint();
    void refuseToPublish();
    void resume() throws EditionFactoryNotFound;
    void closeThePublication() throws EditionFactoryNotFound;
    void show() throws EditionFactoryNotFound;
}
