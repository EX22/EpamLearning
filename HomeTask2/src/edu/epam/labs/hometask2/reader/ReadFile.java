package edu.epam.labs.hometask2.reader;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {

    private static Logger LOG = Logger.getLogger(ReadFile.class.getName());

    public String[] read(InputStream inputStream) {
        String[] arrayOfStrings = null;
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = fileReader.readLine();
            if (line != null) {
                arrayOfStrings = line.split("\\s+");
            }
            fileReader.close();
            return arrayOfStrings;

        } catch (FileNotFoundException e) {
            LOG.log(Level.SEVERE, "The source for array is not found! ", e);
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "During the source for array reading an exception occurred: ", e);
        }
        return null;
    }
}
