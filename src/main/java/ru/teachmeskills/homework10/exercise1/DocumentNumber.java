package ru.teachmeskills.homework10.exercise1;

public class DocumentNumber {

    //Вывод на экран в одну строку два первых блока по 4 цифры.
    static void displayTwoBlocks(String documentNumber){
        String[] words = documentNumber.split("-");
        System.out.println(words[0] + words[2]);
    }

    //Заменяет буквы на "***"
    static void numbersToCharacters(String documentNumber) {
        StringBuilder stringBuilder  = new StringBuilder(documentNumber);
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
        StringBuilder stringBuilder  = new StringBuilder(documentNumber);
        stringBuilder.deleteCharAt(18).delete(8, 13).delete(0, 5);
        stringBuilder.setCharAt(9, '/');
        stringBuilder.setCharAt(7, '/');
        stringBuilder.setCharAt(3, '/');
        System.out.println(stringBuilder.toString().toUpperCase());
    }

    //Ищет последовательность "abc"
    static void lookingForSequence(String documentNumber) {
        String str = "abc";
        int index = documentNumber.toLowerCase().indexOf(str.toLowerCase());
        boolean result = documentNumber.regionMatches(true, index, str, 0,3);
        System.out.println(result);
    }

    // Начинается ли номер документа с последовательности 555.
    static void checkBeginningOfLine(String documentNumber) {
        System.out.println(documentNumber.startsWith("555"));
    }

    // Заканчивается ли номер документа на последовательность 1a2b.
    static void checkEndOfLine(String documentNumber) {
        System.out.println(documentNumber.endsWith("1a2b"));
    }
}
