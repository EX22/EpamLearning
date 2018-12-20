package edu.epam.labs.hometask2.validator;

import edu.epam.labs.hometask2.exception.ValidationException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DataValidatorTest {

    @Test
    public void testValidateArray() {
        try {
            DataValidator dataValidator = new DataValidator();
            String[] testStrings = new String[]{"2", "0.15", "6.461", "0", "93"};
            double[] templateDoubles = new double[]{2.0, 0.15, 6.461, 0.0, 93.0};
            double[] testDoubles = dataValidator.validateArray(testStrings);
            assertEquals(testDoubles, templateDoubles);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
    }


}