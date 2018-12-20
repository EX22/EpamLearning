package edu.epam.labs.hometask2.action;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ActionsOnArrayTest {

    @Test
    public void testSwapOrSquare() {
        ActionsOnArray actionsOnArray = new ActionsOnArray();
        double[] test = new double[]{3.0, 7.0, 8.0};
        double[] template = new double[]{9.0, 49.0, 8.0};
        actionsOnArray.swapOrSquare(test);
        assertEquals(test, template);
    }

    @Test
    public void testGetBinaryLength() {
        ActionsOnArray actionsOnArray = new ActionsOnArray();
        assertEquals(actionsOnArray.getBinaryLength(8), 4);

    }


    @Test
    public void testRound() {
        ActionsOnArray actionsOnArray = new ActionsOnArray();
        double[] test = new double[]{1.7, 3.46, 2.1, 5, 0.544};
        double[] template = new double[]{2.0, 3.0, 2.0, 5.0, 1.0};
        actionsOnArray.round(test);
        assertEquals(test, template);
    }
}