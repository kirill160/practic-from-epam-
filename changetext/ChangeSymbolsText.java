package epam.practic.changetext;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class ChangeSymbolsText {
    public static void main(String[] args) {
        // changeSymbols(3, 't');
        //changeEverLettersHisNumberAlphabet();
        //substringInsertion(3, "str");
        //removeAllSymbols();
        //removeText();
        //countWords();
        //printSymbols();
        //searchLetters();




    }

    /*
1. В каждом слове текста k-ю букву заменить заданным символом. Если
k больше длины слова, корректировку не выполнять.
 */
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

                    bw.write(sb.append(' ').toString());
                    bw.flush();

                }
                bw.write("\n");
                bw.flush();

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*
    2. В тексте каждую букву заменить ее порядковым номером в алфавите. При
выводе в одной строке печатать текст с двумя пробелами между буквами,
в следующей строке внизу под каждой буквой печатать ее номер.
     */
    public static void changeEverLettersHisNumberAlphabet() {
        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("resources/text3.txt"))) {
            String linesWord;
            while ((linesWord = bf.readLine()) != null) {
                String[] words = linesWord.split(" ");
                char symbol;

                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();

                for (String word : words) {
                    for (int i = 0; i < word.length(); i++) {
                        sb.append(word.charAt(i));
                        sb.append("  ");
                    }
                }
                bw.write(sb.toString());
                bw.newLine();
                for (String word : words) {
                    for (int i = 0; i < word.length(); i++) {
                        symbol = word.charAt(i);
                        switch (symbol) {
                            case 'A', 'а' -> sb2.append(1);
                            case 'Б', 'б' -> sb2.append(2);
                            case 'В', 'в' -> sb2.append(3);
                            case 'Г', 'г' -> sb2.append(4);
                            case 'Д', 'д' -> sb2.append(5);
                            case 'Е', 'е' -> sb2.append(6);
                            case 'Ё', 'ё' -> sb2.append(7);
                            case 'Ж', 'ж' -> sb2.append(8);
                            case 'З', 'з' -> sb2.append(9);
                            case 'И', 'и' -> sb2.append(10);
                            case 'Й', 'й' -> sb2.append(11);
                            case 'K', 'к' -> sb2.append(12);
                            case 'Л', 'л' -> sb2.append(13);
                            case 'М', 'м' -> sb2.append(14);
                            case 'Н', 'н' -> sb2.append(15);
                            case 'О', 'о' -> sb2.append(16);
                            case 'П', 'п' -> sb2.append(17);
                            case 'Р', 'р' -> sb2.append(18);
                            case 'С', 'с' -> sb2.append(19);
                            case 'Т', 'т' -> sb2.append(20);
                            case 'У', 'у' -> sb2.append(21);
                            case 'Ф', 'ф' -> sb2.append(22);
                            case 'Х', 'х' -> sb2.append(23);
                            case 'Ц', 'ц' -> sb2.append(24);
                            case 'Ч', 'ч' -> sb2.append(25);
                            case 'Ш', 'ш' -> sb2.append(26);
                            case 'Щ', 'щ' -> sb2.append(27);
                            case 'Ъ', 'ъ' -> sb2.append(28);
                            case 'Ы', 'ы' -> sb2.append(29);
                            case 'Ь', 'ь' -> sb2.append(30);
                            case 'Э', 'э' -> sb2.append(31);
                            case 'Ю', 'ю' -> sb2.append(32);
                            case 'Я', 'я' -> sb2.append(33);
                            default -> sb2.append(symbol);
                        }
                        sb2.append("  ");
                    }
                }
                bw.write(sb2.toString());
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    4. В тексте после k-го символа вставить заданную подстроку.
     */
    public static void substringInsertion(int numberSymbol, String str) {
        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("resources/substringInsertion.txt"))) {

            String word;

            while ((word = bf.readLine()) != null) {
                String[] words = word.split(" ");

                for (int i = 0; i < words.length; i++) {
                    StringBuilder sb = new StringBuilder(words[i]);

                    if (sb.length() > numberSymbol) {
                        sb.insert(numberSymbol, str);
                    }

                    sb.append(" ");
                    bw.write(sb.toString());
                }

                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
   Из текста удалить все символы, кроме пробелов,неявляющиеся буквами.Между
последовательностями подряд идущих букв оставить хотя бы один пробел.
     */

    public static void removeAllSymbols() {
        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("resources/spaces.txt"))) {
            String str;

            String regex = "[^A-Za-zА-Яа-я]|\\d";

            while ((str = bf.readLine()) != null) {
                str = str.replaceAll(regex, "");
                StringBuilder sb = new StringBuilder(str);


                if (str.length() > 2) {
                    sb.setCharAt(2, ' ');
                }
                bw.write(sb.append(str).toString());
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    Удалить из текста его часть, заключенную между двумя символами, кото-
    рые вводятся (например, между скобками «(» и «)» или между звездочками
    «*» и т.п.).
     */
    public static void removeText() {
        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("resources/removeText.txt"))) {
            String str;
            String regex = "\\([^()]+\\)\\s*|\\*[^*]+\\*";

            while ((str = bf.readLine()) != null) {
                Pattern pattern = Pattern.compile(regex);
                Matcher m = pattern.matcher(str);
                while (m.find()) {
                    str = str.replaceAll(regex, "");

                }
                bw.write(str);
                bw.newLine();
            }

            bw.flush();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /*
    9. Определить, сколько раз повторяется в тексте каждое слово, которое встре-
чается в нем.
     */
    public static void countWords() {
        List<String> words = new ArrayList<>();
        String str;
        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"))) {
            while ((str = bf.readLine()) != null) {

                words.addAll(List.of(str.split(" ")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }


    /*
    10. В тексте найти и напечатать n символов (и их количество), встречающихся
    наиболее часто.
     */
    public static void printSymbols() {
        int count = 0;
        String[] alphabet = new String[]{"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "щ", "ъ", "ы", "ь", "э", "ю", "я"};

        List<String> words = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"))) {
            String str;

            while ((str = bf.readLine()) != null) {
                words.addAll(List.of(str.split("")));
            }

            for (String s : alphabet) {
                for (String word : words) {
                    if (word.equalsIgnoreCase(s)) {
                        count++;
                        map.put(s, count);
                    }
                }
                count = 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    11. Найти, каких букв, гласных или согласных, больше в каждом предложении
текста.
     */
    public static void searchLetters(){
        int count = 0;
        int count2 = 0;
        try (BufferedReader bf = new BufferedReader(new FileReader("resources/text.txt"))) {
            String str;

            while ((str = bf.readLine()) != null) {
                String regex = "[А+а+Е+е+Ё+ё+И+и+О+о+У+у+Ы+ы+Э+э+Ю+ю+Я+я+]";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(str);
                String regex2 = "[Б-Щб-щ&&[^АЕЁИОУЫЭЮЯаеёиоуыэюя]]";
                Matcher m2 = Pattern.compile(regex2).matcher(str);
                while (m.find()){
                    count++;
                }
                while(m2.find()){
                    count2++;
                }
                System.out.println(count + " " + count2);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
