package ru.teachmeskills.homework11.exercise1;

class CheckEndOfLineException extends Exception {
    private final String message;

    public CheckEndOfLineException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
