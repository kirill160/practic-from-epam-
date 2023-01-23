package epam.practic.text.word;

import java.util.Arrays;
import java.util.Objects;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }
    public Word(){

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word1 = (Word) o;
        return Objects.equals(getWord(), word1.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord());
    }

    @Override
    public String toString() {
        return  word + " ";
    }
}

