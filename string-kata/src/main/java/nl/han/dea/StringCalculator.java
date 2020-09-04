package nl.han.dea;

import java.util.regex.Pattern;

public class StringCalculator {
    public int addStringNumbers(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            int sumNumbers = 0;
            String[] seperatedString = numbers.split(",|\n|;");
            for (int i = 0; i < seperatedString.length; i++) {
                sumNumbers += Integer.parseInt(seperatedString[i]);
            }
            return (sumNumbers);
        }
    }

    public String[] returnStringOnSplit(String numbers) {
        String[] delimiters = {",", "\n", "***"};

        return delimiters;
    }

//    public int returnStringOnSplit(String numbers) {
//        if (numbers.isEmpty()) {
//            return 0;
//        } else {
//            int sumNumbers = 0;
//            String[] seperatedString = numbers.split(("[,]|[\n]|[***]"));
//            for (int i = 0; i < seperatedString.length; i++) {
//                sumNumbers += Integer.parseInt(seperatedString[i]);
//            }
//            return (sumNumbers);
//        }
//    }
}

