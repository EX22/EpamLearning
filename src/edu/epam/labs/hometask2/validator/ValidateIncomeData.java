package edu.epam.labs.hometask2.validator;

public class ValidateIncomeData {

    public double [] validateArray (String [] strings) {

        int arrLength = 0;
        for (String s: strings){
            if (s.contains("\\d+")){
                arrLength++;
            }
        }
        double [] validArr = new double[arrLength];
        for (int j = 0; j < arrLength; j++){
            if (strings[j].contains("\\d+")){
                validArr[j] = Double.parseDouble(strings[j]);
            }
        }
        return validArr;
    }
}
