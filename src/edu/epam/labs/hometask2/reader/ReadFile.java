package edu.epam.labs.hometask2.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public String [] read (String fileName) {
        String [] arrayOfStrings;
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            String line = fileReader.readLine();
            arrayOfStrings = line.split("\\s+");
            fileReader.close();
            return arrayOfStrings;

        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException exception){
            exception.printStackTrace();
        }
        return null;
    }
}
