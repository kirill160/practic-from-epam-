package epam.practic.text.simpletext;

import epam.practic.text.sentence.Sentence;
import epam.practic.text.word.Word;

public class Text {
    private Sentence sentence = new Sentence();
    private Word word = new Word();

    public Sentence getSentence() {
        return sentence;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }
    public Word setTitleText(Word title){
        sentence.addWord(title);

        return title;
    }
    public  Word completeText(Word word){
        sentence.addWord(word);
        return word;

    }
    public void printText(){
        System.out.println(sentence.createSentence());
    }
}
