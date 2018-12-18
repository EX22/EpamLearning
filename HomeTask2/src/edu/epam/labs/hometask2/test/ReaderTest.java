package edu.epam.labs.hometask2.test;

import edu.epam.labs.hometask2.main.Main;
import edu.epam.labs.hometask2.exception.ValidationException;
import edu.epam.labs.hometask2.reader.Reader;
import edu.epam.labs.hometask2.validator.DataValidator;
import java.io.InputStream;
import static org.testng.Assert.*;

public class ReaderTest {

    @org.testng.annotations.Test
    public void testRead() {
        try {
            Reader readFile = new Reader();
            DataValidator dataValidator = new DataValidator();
            InputStream in = Main.class.getResourceAsStream(
                    "/resources/SourceDataForArray");
            double[] array = dataValidator.validateArray(readFile.read(in));
            assertEquals(array[1], 7.0);
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}