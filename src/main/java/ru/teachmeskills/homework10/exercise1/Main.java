package ru.teachmeskills.homework10.exercise1;

public class Main {
    public static void main(String[] args) {

        String documentNumber = "1234-ABC-5678-def-1a2b";

        DocumentNumber.displayTwoBlocks(documentNumber);
        DocumentNumber.numbersToCharacters(documentNumber);
        DocumentNumber.displayToLower(documentNumber);
        DocumentNumber.displayToUpper(documentNumber);
        DocumentNumber.lookingForSequence(documentNumber);
        DocumentNumber.checkBeginningOfLine(documentNumber);
        DocumentNumber.checkEndOfLine(documentNumber);
    }
}
