package epam.practic.text.simpletext;

import epam.practic.text.sentence.Sentence;
import epam.practic.text.word.Word;
/*1. Создать объект класса Текст, используя классы Предложение, Слово.
        Методы: дополнить текст, вывести на консоль текст, заголовок текста.
        */
public class TestText {
    public static void main(String[] args) {
        Text text = new Text();
        Sentence sentence = new Sentence();
        Word[] words = {new Word("Здесь"), new Word("был"), new Word("мяч")};
        text.setSentence(sentence.addWord(text.setTitleText(new Word("\t" + "Заголовок" + "\n"))).addWord(words).addWord(new Word("но")).addWord(new Word("пропал")));
        text.completeText(new Word("!"));
        text.completeText(new Word("!"));
        text.printText();

    }
}
