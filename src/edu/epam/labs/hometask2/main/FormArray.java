package edu.epam.labs.hometask2.main;

import edu.epam.labs.hometask2.exception.MyExceptions;
import edu.epam.labs.hometask2.round.RoundElements;
import edu.epam.labs.hometask2.search.BinarySearch;
import edu.epam.labs.hometask2.shuffle.ActionsOnArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormArray {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] array = new double[5];
        double x = 0;

        System.out.println("Enter five array's elements :");
        try {
            for (int i = 0; i < array.length; i++) {
                //array [i] = scanner.nextDouble();
                array[i] = Double.parseDouble(reader.readLine());
            }
            System.out.println("Enter the element you want to find: ");
            x = Double.parseDouble(reader.readLine());

        } catch (IOException e) {
            new MyExceptions().printMessage();
        } finally {
            try {
                reader.close();
            } catch (IOException exception) {
                new MyExceptions().printMessage();
            }
        }

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Requested element on the position :" + binarySearch.findElement(array, x));

        RoundElements roundElements = new RoundElements();
        roundElements.rounding(array);

        for (double d : array) {
            System.out.println(d);
        }

        ActionsOnArray actionsOnArray = new ActionsOnArray();
        actionsOnArray.toBinaryOrSquare(array);

        for (double d : array) {
            System.out.println(d);
        }
    }
}
