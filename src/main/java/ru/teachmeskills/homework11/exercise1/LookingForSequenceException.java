package ru.teachmeskills.homework11.exercise1;

class LookingForSequenceException extends Exception {
    private final String message;

    public LookingForSequenceException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
