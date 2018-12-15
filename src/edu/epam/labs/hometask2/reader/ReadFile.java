package edu.epam.labs.hometask2.reader;

import edu.epam.labs.hometask2.exception.NoFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public void ArrayCreation(){
        try {
            BufferedReader fileReader = new BufferedReader(
                    new FileReader(
                            "C:\\Users\\Georgy\\IdeaProjects\\EpamLearning\\TextFileData\\SourceDataForArray"));

            StringBuilder sb = new StringBuilder();
            while (fileReader.ready()){
                sb.append(fileReader.read());
            }




        } catch (FileNotFoundException e){
            new NoFile().printMessage();
        } catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
