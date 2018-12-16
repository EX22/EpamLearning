package edu.epam.labs.hometask2.exception;



public class ValidationException extends Exception{

    public void printMessage(){
        System.out.println("Not valid income data!");
    }
}
