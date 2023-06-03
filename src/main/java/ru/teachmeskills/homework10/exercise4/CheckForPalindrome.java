package ru.teachmeskills.homework10.exercise4;

public class CheckForPalindrome {
    String string;
    String[] words;

    public CheckForPalindrome(String string) {
        this.string = string;
        this. words = string.split(" ");
    }
    public String getString() {
        return string;
    }
    public String[] getWords() {
        return words;
    }
    public void getCheckForPalindrome(int number) {
        number--;
        StringBuilder stringBuilder = new StringBuilder(words[number]);
        stringBuilder.reverse();
        if(words[number].equalsIgnoreCase(stringBuilder.toString()))
            System.out.println("Слово \"" + words[number] + "\" является палиндромом.");
        else
            System.out.println("Слово \"" + words[number] + "\" не является палиндромом.");
    }
}
