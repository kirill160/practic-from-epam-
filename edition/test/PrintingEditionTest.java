package epam.practic.edition.test;

import epam.practic.edition.exception.EditionFactoryNotFound;
import epam.practic.edition.printing.EditionFactory;

public class PrintingEditionTest {
    public static void main(String[] args) throws EditionFactoryNotFound {
        EditionFactory printingEdition = EditionFactory.drawUpAnAgreement();
        printingEdition.show();
    }
}
