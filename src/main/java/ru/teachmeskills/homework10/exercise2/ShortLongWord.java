package ru.teachmeskills.homework10.exercise2;

public class ShortLongWord {

    //Выводит самое длинное слово из строки
    static void findShortWord(String[] words) {
        String str = "";
        for (String word : words) {
            if (word.length() >= str.length())
                str = word;
        }
        System.out.println(str);
    }

    //Выводит самое короткое слово из строки
    static void findLongWord(String[] words) {
        String str = words[0];
        for (String word: words) {
            if(word.length() <= str.length())
                str = word;
        }
        System.out.println(str);
    }
}
