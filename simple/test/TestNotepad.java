package epam.practic.notepad.simple.test;


import epam.practic.notepad.simple.notepad.Notepad;

public class TestNotepad {
    public static void main(String[] args) {
        Notepad.WriteText notepad = new Notepad().new WriteText("10.12.2022");
        notepad.print();


    }
}
