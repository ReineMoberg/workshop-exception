package se.lexicon.exceptions.workshop.exceptions;

public class DuplicateNameException extends Exception{

    private String message;

    public DuplicateNameException() {
        message = "The name you are trying to add already exists. ";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
