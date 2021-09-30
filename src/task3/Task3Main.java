package task3;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Task3Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static List<Character> vocalList = Arrays.asList('а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е');

    public static void main(String[] args) {

        System.out.println("scanning string");
        String consoleInput = scanner.nextLine();
        List<String> words = Arrays.asList(consoleInput.split(" "));

        //цикл по словам
        for (String word : words) {
            System.out.println("количество гласных в слове " + word + " : " + countVocals(word));
        }

        words.sort((o1, o2) -> countVocals(o2) - countVocals(o1));

        System.out.println(words);

        List<String> listWithUpperVocal = new ArrayList<>();

        for (String word : words) {
            listWithUpperVocal.add(makeFirstVocalUpperCase(word));
        }

        System.out.println(listWithUpperVocal);
    }

    //подсчет несогласных
    private static int countVocals(String word) {
        int vocalCounter = 0;
        //цикл по слову
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);

            if (isVocal(c)) {
                vocalCounter++;
            }

        }
        return vocalCounter;
    }

    //гласнаяорнот
    private static boolean isVocal(Character c) {
        boolean isvocal = false;
        for (Character vocal : vocalList) {
            if (c.equals(vocal) || c.equals(Character.toUpperCase(vocal))) {
                isvocal = true;
            }
        }
        return isvocal;
    }

    private static String makeFirstVocalUpperCase(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (isVocal(aChar)) {
                chars[i] = Character.toUpperCase(aChar);
                break;
            }
        }

        return new String(chars);


    }
}
