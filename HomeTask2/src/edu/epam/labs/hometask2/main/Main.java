package edu.epam.labs.hometask2.main;

import edu.epam.labs.hometask2.action.ArrayHandler;
import edu.epam.labs.hometask2.action.BinarySearch;
import edu.epam.labs.hometask2.exception.ReaderException;
import edu.epam.labs.hometask2.exception.ValidationException;
import edu.epam.labs.hometask2.reader.Reader;
import edu.epam.labs.hometask2.validator.DataValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Runs manipulation on array methods.
 */
public class Main {

    private static Logger LOG = Logger.getLogger(Main.class.getName());

    public static void outputArray(String message, double[] array) {

        StringBuilder sb = new StringBuilder(message + " ");
        for (int i = 0; i < array.length; i++) {
            sb.append((array[i]));
            if (i < array.length - 1)
                sb.append(", ");
        }
        LOG.log(Level.INFO, sb.toString());
    }

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Reader readFile = new Reader();
        DataValidator dataValidator = new DataValidator();

        try {
            // Read and validate array of doubles from the file.
            InputStream in = Main.class.getResourceAsStream(
                    "/edu/epam/labs/hometask2/resources/SourceDataForArray");
            double[] array = dataValidator.validateArray(readFile.read(in));

            outputArray("Read array from file", array);

            // Running binary search in array. Searched element passing into method as a constant value.
            BinarySearch binarySearch = new BinarySearch();
            int elemIndex = binarySearch.find(array, 7);
            outputArray("Sorted array after binary search", array);
            if (elemIndex != -1) {
                LOG.log(Level.INFO, "Requested element 7.0 on the position :" + elemIndex);
            } else {
                LOG.log(Level.INFO, "Requested element is not found.");
            }

            // Running method round on array.
            ArrayHandler arrayHandler = new ArrayHandler();
            arrayHandler.round(array);

            outputArray("Rounded", array);

            // Running method swapOrSquare on array.
            arrayHandler.swapOrSquare(array);

            outputArray("Swapped and squared", array);


        } catch (ValidationException e) {
            LOG.log(Level.SEVERE, "Input data validation error: ", e);
        } catch (ReaderException e) {
            LOG.log(Level.SEVERE, "Exception reading stream", e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                LOG.log(Level.WARNING, "During closing the reader exception occurred: ", e);
            }
        }
    }

}
