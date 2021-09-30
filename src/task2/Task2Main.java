package task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2Main {
    private final static Scanner scanner = new Scanner(System.in);
    private static final List<Integer> simpleNumberList = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199);

    public static void main(String[] args) {

        System.out.println("scanning string");
        String consoleInput = scanner.nextLine();

        try {
            long consoleInteger = Long.parseLong(consoleInput);
            for (Integer simpleNumber : simpleNumberList) {
                long remainder = consoleInteger % simpleNumber;
                if (remainder == 0) {
                    System.out.println(simpleNumber);

                }

            }
        } catch (NumberFormatException lol) {
            System.out.println("Введите целое число, ПОЖАЛУЙСТА");
        }
    }
}
