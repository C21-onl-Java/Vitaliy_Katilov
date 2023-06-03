package ru.teachmeskills.homework10.exercise5;

public class Main {
    public static void main(String[] args) {

        Duplication word = new Duplication();
        System.out.println();

        String duplicatedWord = word.duplicateCharacter("Hello!");
        System.out.println(duplicatedWord);

        System.out.println();

        duplicatedWord = word.duplicateCharacter("Duplication.");
        System.out.println(duplicatedWord);
    }
}
