package edu.epam.labs.hometask2.exception;

/**
 * Exception thrown during the file reading.
 */
public class ReaderException extends Exception {

    /**
     * @param message passed to parent constructor.
     */
    public ReaderException(String message) {
        super(message);
    }
}
