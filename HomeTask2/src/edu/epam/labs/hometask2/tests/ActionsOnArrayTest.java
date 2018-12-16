package edu.epam.labs.hometask2.tests;

import edu.epam.labs.hometask2.actions.ActionsOnArray;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ActionsOnArrayTest {

    @Test
    public void testSwapOrSquare() {
        ActionsOnArray actionsOnArray = new ActionsOnArray();
        double [] test = new  double [] {3.0, 7.0, 8.0};
        double [] template = new double [] {9.0, 49.0, 8.0};
        actionsOnArray.swapOrSquare(test);
        assertEquals(test, template);
    }

    @Test
    public void testGetBinaryLength() {
        ActionsOnArray actionsOnArray = new ActionsOnArray();
        assertEquals(actionsOnArray.getBinaryLength(8), 4);

    }
}