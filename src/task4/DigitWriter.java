package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitWriter {


    private final List<String[]> digits;

    public List<String[]> getDigits(){
        return digits;
    }

    public DigitWriter(){

        String[] zero = {"****",
                         "*  *",
                         "*  *",
                         "*  *",
                         "****"};

        String[] one = {"   *",
                        "   *",
                        "   *",
                        "   *",
                        "   *"};

        String[] two = {" ***",
                        "*  *",
                        "  * ",
                        " *  ",
                        "****"};

        String[] three = {"****",
                          "   *",
                          "****",
                          "   *",
                          "****"};

        String[] four = {"*  *",
                         "*  *",
                         "****",
                         "   *",
                         "   *"};

        String[] five = {"****",
                         "*   ",
                         "****",
                         "   *",
                         "****"};

        String[] six = {"****",
                        "*   ",
                        "****",
                        "*  *",
                        "****"};

        String[] seven = {"****",
                          "   *",
                          "   *",
                          "   *",
                          "   *"};

        String[] eight = {"****",
                          "*  *",
                          "****",
                          "*  *",
                          "****"};

        String[] nine = {"****",
                         "*  *",
                         "****",
                         "   *",
                         "****"};


        digits = new ArrayList<>();
        Collections.addAll(digits, zero, one, two, three, four, five, six, seven, eight, nine);


    }

}
