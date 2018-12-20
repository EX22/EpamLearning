package edu.epam.labs.hometask2.reader;

import edu.epam.labs.hometask2.exception.ReaderException;
import edu.epam.labs.hometask2.main.Main;
import edu.epam.labs.hometask2.exception.ValidationException;
import edu.epam.labs.hometask2.validator.DataValidator;
import org.testng.annotations.Test;

import java.io.InputStream;

import static org.testng.Assert.*;

public class ReaderTest {

    /**
     * Integration test for DataValidator and Reader.
     * Checks positive test case: file exists and contains valid data.
     *
     * @throws ReaderException     in case when test fails.
     * @throws ValidationException in case when test fails.
     */
    @Test
    public void testRead() throws ReaderException, ValidationException {

        Reader readFile = new Reader();
        DataValidator dataValidator = new DataValidator();
        InputStream in = Main.class.getResourceAsStream(
                "/edu/epam/labs/hometask2/resources/SourceDataForArray");
        double[] array = dataValidator.validateArray(readFile.read(in));
        assertEquals(array[1], 8.0);

    }

    /**
     * Checks negative test case: file does not exist.
     *
     * @throws ReaderException in case when test succeeds.
     */
    @Test(expectedExceptions = ReaderException.class)
    public void testRead1() throws ReaderException {
        Reader readFile = new Reader();
        InputStream in = Main.class.getResourceAsStream(
                "/edu/epam/labs/hometask2/resources/NonExistingFile");
        readFile.read(in);
    }
}