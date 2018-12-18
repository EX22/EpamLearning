package edu.epam.labs.hometask2.validator;

import edu.epam.labs.hometask2.exception.ValidationException;
import java.util.Arrays;
import java.util.regex.Pattern;


/**
 * Check incoming data, skip not valid elements.
 */
public class DataValidator {
    /**
     *
     * @param strings array of strings. Should contain elements which might be converted into double. For example "7.0".
     * @return array of doubles. Not valid strings from input are ignored.
     * @throws ValidationException if strings is null or strings.length == 0 or there is no valid elements in strings.
     */
    public double[] validateArray(String[] strings) throws ValidationException{
        if (strings == null){
            throw new ValidationException("Strings is null");
        } else if (strings.length == 0){
            throw new ValidationException("Array's length is 0");
        }
        int j = 0;
        double[] validArr = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (Pattern.matches("\\d+\\.*?\\d*?", strings[i])) {
                validArr[j] = Double.parseDouble(strings[i]);
                j++;
            }
        }
        if (j == 0){
            throw new ValidationException("There is no valid elements in array.");
        }
        return Arrays.copyOfRange(validArr, 0, j);
    }
}
