package task5;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Task5Main {
    private final static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println("Введите вместимость сейфа(целое число)");
        String safeVolumeString = scanner.nextLine();
        int safeVolume = Integer.parseInt(safeVolumeString);

        System.out.println("Вводите целые числа (объем),(ценность) (enter), если хотите завершить ввод предметов напишите N");
        List<SafeItem> safeItems = new ArrayList<>();
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("N")) {
                break;
            }
            String[] split = s.split(",");
            SafeItem safeItem = new SafeItem(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            safeItems.add(safeItem);
        }

        System.out.println("общая ценность сейфа = " +
                findOptimal(safeItems.size() - 1, safeVolume, safeItems));


    }

    private static int findOptimal(int i, int volume, List<SafeItem> items) {

        if (i < 0) {
            return 0;
        }
        if (items.get(i).getVolume() > volume) {
            return findOptimal(i - 1, volume, items);
        } else {
            return Math.max(findOptimal(i - 1, volume, items),
                    findOptimal(i - 1, volume - items.get(i).getVolume(), items) + items.get(i).getValue());
        }
    }
}
