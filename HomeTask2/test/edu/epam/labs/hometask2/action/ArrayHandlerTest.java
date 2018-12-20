package edu.epam.labs.hometask2.action;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayHandlerTest {

    /**
     * Checks if ArrayHandler's swapOrSquare method properly swap elements in received array's
     * or gets them into square according to conditions.
     */
    @Test
    public void testSwapOrSquare() {
        ArrayHandler arrayHandler = new ArrayHandler();
        double[] test = new double[]{3.0, 7.0, 8.0};
        double[] template = new double[]{9.0, 49.0, 8.0};
        arrayHandler.swapOrSquare(test);
        assertEquals(test, template);
    }

    /**
     * Checks if ArrayHandler's getBinaryLength method return proper binary number's length of decimal number.
     */
    @Test
    public void testGetBinaryLength() {
        ArrayHandler arrayHandler = new ArrayHandler();
        assertEquals(arrayHandler.getBinaryLength(8), 4);

    }


    /**
     * Checks if ArrayHandler's round method properly rounding elements in received array.
     */
    @Test
    public void testRound() {
        ArrayHandler arrayHandler = new ArrayHandler();
        double[] test = new double[]{1.7, 3.46, 2.1, 5, 0.544};
        double[] template = new double[]{2.0, 3.0, 2.0, 5.0, 1.0};
        arrayHandler.round(test);
        assertEquals(test, template);
    }
}