package task4;

import java.util.*;

public class Task4Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static DigitWriter digitWriter = new DigitWriter();
    public static void main(String[] args) {

        System.out.println("scanning string");
        String consoleInput = scanner.nextLine();

        char[] chars = consoleInput.toCharArray();
        List<Integer> ints = new ArrayList<>();


        for (char aChar : chars) {
            ints.add(Character.getNumericValue(aChar));
        }

        int maxDigit = Collections.max(ints);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (Integer digitIntValue : ints) {
                if (digitIntValue == maxDigit){
                    builder.append(digitWriter.getDigits().get(digitIntValue)[i].replaceAll("\\*", digitIntValue.toString()));
                } else {
                    builder.append(digitWriter.getDigits().get(digitIntValue)[i]);
                }

                builder.append(" ");
            }
            builder.append("\n");
        }

        System.out.println(builder.toString());


    }
}
