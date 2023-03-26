package epam.practic.strings.text;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. В каждом слове текста k-ю букву заменить заданным символом. Если
k больше длины слова, корректировку не выполнять.
 */
public class ChangeSymbolsText {
    public static void main(String[] args) {
        changeSymbols(3, 't');

    }

    public static void changeSymbols(int numberSymbol, char symbol) {

        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("resources/text2.txt"))) {
            String lineWords;
            while ((lineWords = bf.readLine()) != null) {
                String[] words = lineWords.split(" ");
                for (String word : words) {
                    StringBuilder sb = new StringBuilder(word);
                    if (word.length() > numberSymbol) {
                        sb.setCharAt(numberSymbol, symbol);
                    }

                    bw.write(sb + " ");
                    bw.flush();

                }
                bw.write("\n");
                bw.flush();

            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}


