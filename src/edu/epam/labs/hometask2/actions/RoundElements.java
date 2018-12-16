package edu.epam.labs.hometask2.actions;

// Округление элементов массива

public class RoundElements {

    public void round (double [] arr){
        for (int i = 0; i < arr.length; i++){
           arr[i] = Math.round(arr[i]);
        }
    }
}
