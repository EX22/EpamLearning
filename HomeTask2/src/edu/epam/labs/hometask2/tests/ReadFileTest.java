package edu.epam.labs.hometask2.tests;

import edu.epam.labs.hometask2.Main;
import edu.epam.labs.hometask2.exception.ValidationException;
import edu.epam.labs.hometask2.reader.ReadFile;
import edu.epam.labs.hometask2.validator.ValidateIncomingData;
import java.io.InputStream;
import static org.testng.Assert.*;

public class ReadFileTest {

    @org.testng.annotations.Test
    public void testRead() {
        try {
            ReadFile readFile = new ReadFile();
            ValidateIncomingData validateIncomingData = new ValidateIncomingData();
            InputStream in = Main.class.getResourceAsStream(
                    "/edu/epam/labs/hometask2/resources/SourceDataForArray");
            double[] array = validateIncomingData.validateArray(readFile.read(in));
            assertEquals(array[1], 7.0);
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}