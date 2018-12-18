package edu.epam.labs.hometask2.reader;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Read file from given resource.
 */
public class Reader {

    private static Logger LOG = Logger.getLogger(Reader.class.getName());

    /**
     * @param inputStream input stream to read data from.
     * @return array of strings.
     */
    public String[] read(InputStream inputStream) {
        String[] arrayOfStrings = null;
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = fileReader.readLine();
            if (line != null) {
                arrayOfStrings = line.split("\\s+");
            }
            fileReader.close();


        } catch (FileNotFoundException e) {
            LOG.log(Level.SEVERE, "The source for array is not found! ", e);
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "During the source for array reading an exception occurred: ", e);
        }
        return arrayOfStrings;
    }
}
