package edu.epam.labs.hometask2.round;

// Округление элементов массива

public class RoundElements {

    public void rounding (double [] arr){
        for (int i = 0; i < arr.length; i++){
           arr[i] = Math.round(arr[i]);
        }
        //return arr;
    }
}
