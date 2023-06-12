package ru.teachmeskills.homework10.exercise5;

public class Duplication {
    public String duplicateCharacter(String str) {
        StringBuilder  stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i += 2) {
            stringBuilder.insert(i, stringBuilder.charAt(i));
        }
        return stringBuilder.toString();
    }
}
