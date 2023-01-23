package epam.practic.text.sentence;

import epam.practic.text.word.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> words = new ArrayList<>();

    public Sentence() {

    }
    public Sentence addWord(Word ...word){
        words.addAll(List.of(word));
        return this;
    }

    public String createSentence(){
        StringBuilder sb = new StringBuilder();
          for (Word word : words) {
              sb.append(word.getWord());
              sb.append(" ");
          }

      return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }
}







