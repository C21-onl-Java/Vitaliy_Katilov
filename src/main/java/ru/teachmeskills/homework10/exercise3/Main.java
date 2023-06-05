package ru.teachmeskills.homework10.exercise3;

public class Main {
    public static void main(String[] args) {

        MinimumNumberOfCharacters minCharacter = new MinimumNumberOfCharacters();
        MinimumNumberOfCharacters minCharacter2 = new MinimumNumberOfCharacters();

        minCharacter.getMinimumNumberOfCharacters("jkjk fffff ab f 1234");

        System.out.println();

        minCharacter2.getMinimumNumberOfCharacters("arbitrary length with arbitrary words.");

    }
}
