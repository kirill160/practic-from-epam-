package epam.practic.classes.notepad.Test;


import epam.practic.classes.notepad.Notepad;


public class TestNotepad {
    public static void main(String[] args) {
        Notepad.InputData inputData = new Notepad().new InputData("10.12.2022", "мама", "мыла", "раму");
        inputData.setData("z", "d");
        inputData.isCorrectDate();
        inputData.addRecord();
        inputData.printData();



    }
}
