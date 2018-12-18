package edu.epam.labs.hometask2.exception;


/**
 * Exception thrown during array validation, usually means that data are not usable.
 */
public class ValidationException extends Exception{

    /**
     * @param message passed to parent constructor.
     */
    public ValidationException(String message) {
        super(message);
    }

}
