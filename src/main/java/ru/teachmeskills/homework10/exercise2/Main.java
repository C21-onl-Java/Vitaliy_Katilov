package ru.teachmeskills.homework10.exercise2;

public class Main {
    public static void main(String[] args) {
        String text = "Найти самое короткое слово в строке и вывести его на экран";
        String[] words = text.split(" ");
        ShortLongWord.findShortWord(words);
        ShortLongWord.findLongWord(words);
    }

}
