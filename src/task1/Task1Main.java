package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("scanning string");
        String consoleInput = scanner.nextLine();

        char[] chars = consoleInput.toCharArray();

        List<Character> charListDigits = new ArrayList<>();

        for (Character aChar : chars) {
            if (Character.isDigit(aChar)) {
                charListDigits.add(aChar);
            }
        }

        int sum = 0;
        for (Character charListDigit : charListDigits) {
            int integer = Integer.parseInt(charListDigit.toString());
            sum += integer;
        }
        System.out.println(sum);

    }

}
