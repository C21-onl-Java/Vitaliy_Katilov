package ru.teachmeskills.homework11.exercise2;

public class WrongLoginException extends Exception {
    private final String message;

    public WrongLoginException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
