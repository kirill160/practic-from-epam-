package epam.practic.classes.notepad;

import epam.practic.classes.notepad.addendum.Addendum;

import java.util.ArrayList;
import java.util.List;

/*
1. Создать класс Notepad с внутренним классом или классами, с помощью
объектов которого могут храниться несколько записей на одну дату.
 */
public class Notepad {
    //private Repository repository;
    private InputData input;
    private List<String> records;

    public Notepad() {
        input = new InputData();
        records = new ArrayList<>();

    }


    //    public class Repository implements Addendum {
//        private  InputData input;
//        private List<String> records;
//
//        public Repository() {
//            input = new InputData();
//            records = new ArrayList<>();
//        }
//
//        @Override
//        public boolean isCorrectDate() {
//            return input.dayMonthYear != null;
//        }
//
//        @Override
//        public void addRecord() {
//            while (isCorrectDate()) {
//                records.addAll(Arrays.asList(input.data));
//
//            }
//
//        }
//
//        @Override
//        public void printData() {
//            System.out.println(input.dayMonthYear + " " + Arrays.toString(input.data));
//        }
//
//        @Override
//        public String toString() {
//            return "Repository{" +
//                    "input=" + input +
//                    ", records=" + records +
//                    '}';
//        }
//    }
    public class InputData {
        private String dayMonthYear;
        private final List<String> data = new ArrayList<>();

        public InputData(String dayMonthYear, String... data) {
            this.dayMonthYear = dayMonthYear;
            this.data.addAll(List.of(data));
        }

        public String getDayMonthYear() {
            return dayMonthYear;
        }

        public void setDayMonthYear(String dayMonthYear) {
            this.dayMonthYear = dayMonthYear;
        }

        public void setData(String... data) {
            this.data.addAll(List.of(data));
        }

        public InputData() {

        }

        public String getData() {
            return dayMonthYear;
        }

        public void setDate(String dayMonthYear) {
            this.dayMonthYear = dayMonthYear;
        }

        public boolean isCorrectDate() {
            return this.dayMonthYear != null;
        }


        public void addRecord() {
            if (isCorrectDate()) {
                records.addAll(this.data);

            }

        }

        public void printData() {
            System.out.println(this.dayMonthYear + "\n" + data);
        }

        @Override
        public String toString() {
            return "Input{" +
                    "data='" + dayMonthYear + '\'' +
                    '}';
        }


    }
}
