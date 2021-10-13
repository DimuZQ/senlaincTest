package task2;


import java.util.Scanner;

public class Task2Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("scanning string");
        String consoleInput = scanner.nextLine();

        try {
            int consoleInt = Integer.parseInt(consoleInput);

            for (int i = 2; i <= consoleInt;) {

                if (consoleInt % i == 0){
                    System.out.print(i);
                    System.out.print(" ");
                    consoleInt = consoleInt / i;
                    i = 2;
                } else i++;

            }
        } catch (NumberFormatException lol) {
            System.out.println("Введите целое число, ПОЖАЛУЙСТА");
        }
    }
}
