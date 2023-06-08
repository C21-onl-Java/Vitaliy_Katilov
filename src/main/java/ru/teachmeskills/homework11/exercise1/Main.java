package ru.teachmeskills.homework11.exercise1;

public class Main {
    public static void main(String[] args) throws PrefixException {

        String documentNumber = "1554-ABC-5678-def-1a2b";

        DocumentNumber.displayTwoBlocks(documentNumber);
        DocumentNumber.numbersToCharacters(documentNumber);
        DocumentNumber.displayToLower(documentNumber);
        DocumentNumber.displayToUpper(documentNumber);

        try {
            DocumentNumber.lookingForSequence(documentNumber);
            System.out.println("Номер документа содержит последовательность \"abc\".");
        } catch (LookingForSequenceException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            DocumentNumber.checkBeginningOfLine(documentNumber);
            System.out.println("Номер документа начинается с последовательности \"555\".");
        } catch (PrefixException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            DocumentNumber.checkEndOfLine(documentNumber);
            System.out.println("Номер документа заканчивается на последовательность \"1a2b\".");
        } catch (CheckEndOfLineException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
