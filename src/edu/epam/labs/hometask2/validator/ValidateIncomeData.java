package edu.epam.labs.hometask2.validator;

import java.util.regex.Pattern;

public class ValidateIncomeData {

    public double [] validateArray (String [] strings) {

        int arrLength = 0;
        for (String s: strings){
            if (Pattern.matches("\\d+\\.*?\\d*?", s)){
                arrLength++;
            }
        }
        double [] validArr = new double[arrLength];
        for (int i = 0; i < arrLength; i++){
            if (Pattern.matches("\\d+\\.*?\\d*?", strings[i])){
                validArr[i] = Double.parseDouble(strings[i]);
            }
        }
        return validArr;
    }
}
