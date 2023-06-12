package ru.teachmeskills.homework11.exercise2;

public class WrongPasswordException extends Throwable {
    private final String message;

    public WrongPasswordException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
