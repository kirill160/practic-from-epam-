package epam.practic.edition.printing;

import epam.practic.edition.actionable.Actionable;
import epam.practic.edition.book.Book;
import epam.practic.edition.exception.EditionFactoryNotFound;
import epam.practic.edition.magazine.Magazine;
import epam.practic.edition.tutorial.Tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
Разработать проект управления процессами на основе создания и реализа-
ции интерфейсов для следующих предметных областей:
1. Полиграфические издания. Возможности: оформить договор; открыть\
редактировать\верстать издание; отправить на печать; отказаться от изда-
ния; оплатить издание; возобновить\закрыть издание. Добавить специали-
зированные методы для Книги, Журнала, Учебного пособия.
2. Абонент мобильного оператора. Возможности: оформить
 */
public abstract class EditionFactory implements Actionable {
    protected String name;
    protected int numberOfPages;
    protected List<String> text;
    protected static Scanner console = new Scanner(System.in);
    public static final String ANSWER_YES = "Да";
    public static final String ANSWER_NO = "Нет";
    private boolean refused;

    public EditionFactory(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.text = new ArrayList<>();
    }

    public EditionFactory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Scanner getConsole() {
        return console;
    }

    public void setConsole(Scanner console) {
        EditionFactory.console = console;
    }

    protected abstract EditionFactory createEdition();

    @Override
    public void show() throws EditionFactoryNotFound {
        if (!refused) {
            open();
            edit();
            sendToPrint();
            refuseToPublish();


        }

    }

    @Override
    public abstract boolean isExecutionOfContract();

    @Override
    public void open() throws EditionFactoryNotFound {
        console.nextLine();
        System.out.println("вы хотите открыть издание?" + "\n" + "Введите \"да\" или \"нет\"");
        String answer = console.nextLine();
        if (answer.equalsIgnoreCase(ANSWER_YES)) {
            System.out.println("издание которое вы выбрали открыто");
        } else if (answer.equalsIgnoreCase(ANSWER_NO)) {
            System.out.println("издание не открыто");
            closeThePublication();
        } else {
            System.out.println("неправильный введён ответ введите ещё раз");
            open();
        }


    }

    @Override
    public void edit() {
        System.out.println("Выберите 1 для добавления или 2 для удаления текста, нажмите любую клавишу для выхода");

        int select = console.nextInt();
        if (select == 1) {
            System.out.println("добавляем текст");
            console.nextLine();

            String addText = console.nextLine();
            String[] words = addText.split(" ");

            Collections.addAll(text, words);
        } else if (select == 2) {
            System.out.println("удаляем текст с конца");

            int lastWordInText = text.size() - 1;
            text.remove(lastWordInText);

        }else{
            return;
        }
    }

    @Override
    public void typeset() {

    }


    public static EditionFactory drawUpAnAgreement() throws EditionFactoryNotFound {
        System.out.println("Вы хотите заключить договор?" + "\n" + "Введите да или нет");

        String answer = console.nextLine();
        if (answer.equalsIgnoreCase(ANSWER_YES)) {
            System.out.println("Договор оформлен");
        } else if (answer.equalsIgnoreCase(ANSWER_NO)) {
            System.out.println("Договор не оформлен");
            System.exit(0);


        } else {
            throw new EditionFactoryNotFound("введён неверный ответ");

        }

        System.out.println("выберите что вы хотите издать: 1 - книга, 2 - журнал, 3 - учебное пособие");
        int select = console.nextInt();
        return switch (select) {
            case 1 -> new Book("Java from Epam", 560);
            case 2 -> new Magazine("Мир моды", 35);
            case 3 -> new Tutorial("Букварь", 55);
            default -> throw new EditionFactoryNotFound("введён неверный номер");
        };


    }


    @Override
    public void layoutThePublications() {

    }

    @Override
    public void sendToPrint() {
        //console.nextLine();
        System.out.println("введите \"да\" для отправление на печать или \"нет\" что бы не отправлять на печать");

        String answer = console.nextLine();
        if (answer.equalsIgnoreCase(ANSWER_YES)) {
            System.out.println("материал " + getName() + " распечатан");
            if (text.size() == 0) {
                System.out.println("материала  ету");
                return;
            }

            for (String text : text) {
                System.out.print(text + " ");
            }
        } else if (answer.equalsIgnoreCase(ANSWER_NO)) {
            System.out.println("страница не распечатана");

        }

    }

    @Override
    public void refuseToPublish() {
        System.out.println("Вы хотите отказаться от издания?" + "\n" + "Введите \"да\" что бы отказаться или \"нет\" чтобы продолжить");

        String answer = console.nextLine();
        if (answer.equalsIgnoreCase(ANSWER_YES)) {
            System.out.println("вы отказались от издания");
            refused = true;
        } else if (answer.equalsIgnoreCase(ANSWER_NO)) {
            System.out.println("Вы не отказались от издания");
            refused = false;
        }


    }

    @Override
    public void resume() throws EditionFactoryNotFound {
        System.out.println("вы хотите возобновить издание");
        String answer = console.nextLine();

        if (answer.equalsIgnoreCase(ANSWER_YES)) {
            System.out.println("вы возобновили задание");
            drawUpAnAgreement();
        } else if (answer.equalsIgnoreCase(ANSWER_NO)) {
            System.out.println("Вы не отказались от издания");


        }
    }

    @Override
    public  void closeThePublication() throws EditionFactoryNotFound {
        System.out.println("Выход из программы");
        System.exit(0);
    }


}
