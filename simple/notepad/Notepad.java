package epam.practic.notepad.simple.notepad;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/*
1. Создать класс Notepad с внутренним классом или классами, с помощью
объектов которого могут храниться несколько записей на одну дату.
 */
public class Notepad {
    private WriteText writeText;

    public Notepad() {
        writeText = new WriteText();

    }

    public class WriteText {
        private String dayMonthYear;
        private final List<String> offerList = new ArrayList<>();

        public WriteText(String dayMonthYear) {
            this.dayMonthYear = dayMonthYear;
            readWords();

        }

        public WriteText() {

        }

        public String getDayMonthYear() {
            return dayMonthYear;
        }

        public void setDayMonthYear(String dayMonthYear) {
            this.dayMonthYear = dayMonthYear;
        }

        public List<String> getOfferList() {
            return offerList;
        }

        public void readWords() {
            String text;
            Scanner console = new Scanner(System.in);
            while (!Objects.equals(text = console.nextLine(), "ESC")) {

                offerList.add(text);
            }
            console.close();

        }

        public void print() {
            System.out.println(dayMonthYear);
            for (String words : offerList) {
                System.out.println(words);

            }
        }

        @Override
        public String toString() {
            return "Input{" +
                    "data='" + dayMonthYear + '\'' +
                    '}';
        }


    }
}
