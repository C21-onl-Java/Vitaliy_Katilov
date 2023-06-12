package ru.teachmeskills.homework11.exercise1;

public class DocumentNumber {

    //Вывод на экран в одну строку два первых блока по 4 цифры.
    static void displayTwoBlocks(String documentNumber) {
        String[] words = documentNumber.split("-");
        System.out.println(words[0] + words[2]);
    }

    //Заменяет буквы на "***"
    static void numbersToCharacters(String documentNumber) {
        StringBuilder stringBuilder = new StringBuilder(documentNumber);
        stringBuilder.replace(5, 8, "***").replace(14, 17, "***");
        System.out.println(stringBuilder);
    }

    //Выводит буквы в нижнем регистре
    static void displayToLower(String documentNumber) {
        String[] words = documentNumber.split("-");
        char[] charWords = words[4].toCharArray();
        String newWords = words[1] + "/" + words[3] + "/" + charWords[1] + "/" + charWords[3];
        System.out.println(newWords.toLowerCase());
    }

    //Выводит буквы в верхнем регистре с помощью StringBuilder
    static void displayToUpper(String documentNumber) {
        StringBuilder stringBuilder = new StringBuilder(documentNumber);
        stringBuilder.deleteCharAt(18).delete(8, 13).delete(0, 5);
        stringBuilder.setCharAt(9, '/');
        stringBuilder.setCharAt(7, '/');
        stringBuilder.setCharAt(3, '/');
        System.out.println(stringBuilder.toString().toUpperCase());
    }

    //Ищет последовательность "abc"
    static void lookingForSequence(String documentNumber) throws LookingForSequenceException {
        int result = documentNumber.toLowerCase().indexOf("abc");
        if (result < 0)
            throw new LookingForSequenceException("Exception: Номер документа не содержит последовательность \"abc\".");
    }

    // Начинается ли номер документа с последовательности 555.
    static void checkBeginningOfLine(String documentNumber) throws PrefixException {
        if (!documentNumber.startsWith("555"))
            throw new PrefixException("Exception: Номер документа не начинается с последовательности \"555\".");
    }

    // Заканчивается ли номер документа на последовательность 1a2b.
    static void checkEndOfLine(String documentNumber) throws CheckEndOfLineException {
        if (!documentNumber.endsWith("1a2b"))
            throw new CheckEndOfLineException("Exception: Номер документа не заканчивается на последовательность \"1a2b\".");
    }
}
