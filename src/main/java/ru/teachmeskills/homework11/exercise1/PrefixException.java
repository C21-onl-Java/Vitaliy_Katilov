package ru.teachmeskills.homework11.exercise1;

class PrefixException extends Exception {
    private final String message;

    public PrefixException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
