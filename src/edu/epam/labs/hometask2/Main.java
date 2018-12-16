package edu.epam.labs.hometask2;

import edu.epam.labs.hometask2.actions.ActionsOnArray;
import edu.epam.labs.hometask2.actions.BinarySearch;
import edu.epam.labs.hometask2.actions.RoundElements;
import edu.epam.labs.hometask2.exception.ValidationException;
import edu.epam.labs.hometask2.reader.ReadFile;
import edu.epam.labs.hometask2.validator.ValidateIncomeData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        double x = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ReadFile readFile = new ReadFile();
        ValidateIncomeData validateIncomeData = new ValidateIncomeData();
        double[] array = validateIncomeData.validateArray(readFile.read(
                "C:\\Users\\Georgy\\IdeaProjects\\EpamLearning\\SourceDataForArray"));
        try {
            System.out.println("Enter the element you want to find: ");
            x = Double.parseDouble(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException exception) {
               exception.printStackTrace();
            }
        }

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Requested element on the position :" + binarySearch.find(array, x));


        RoundElements roundElements = new RoundElements();
        roundElements.round(array);

        for (double d : array) {
            System.out.println(d);
        }

        ActionsOnArray actionsOnArray = new ActionsOnArray();
        actionsOnArray.swapOrSquare(array);

        System.out.println("Swapped or Squared");


        for (double d : array) {
            System.out.println(d);
        }
    }

}
