package edu.epam.labs.hometask2.main;

import edu.epam.labs.hometask2.action.ActionsOnArray;
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

public class Main {

    private static Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        double x = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Reader readFile = new Reader();
        DataValidator dataValidator = new DataValidator();
        try {
            InputStream in = Main.class.getResourceAsStream(
                    "/edu/epam/labs/hometask2/resources/SourceDataForArray");
            double[] array = dataValidator.validateArray(readFile.read(in));

            if (args.length > 0) {
                try {
                    x = Double.parseDouble(args[0]);
                } catch (NumberFormatException e) {
                    LOG.log(Level.WARNING, "Argument " + args[0] + " must be a double.", e);
                }
            }

            BinarySearch binarySearch = new BinarySearch();
            int elemIndex = binarySearch.find(array, x);
            if (elemIndex != -1) {
                System.out.println("Requested element " + x + " on the position :" + elemIndex);
            } else {
                System.out.println("Requested element is not found.");
            }

            ActionsOnArray actionsOnArray = new ActionsOnArray();
            actionsOnArray.round(array);

            for (double d : array) {
                System.out.println(d);
            }

            actionsOnArray.swapOrSquare(array);

            System.out.println("Swapped or Squared");


            for (double d : array) {
                System.out.println(d);
            }

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
