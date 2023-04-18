package ru.teachmeskills.homework03;

public class Weeks {
    public static void main(String[] args) {
        final int WEEKS = 7;
        final int MAX = 98;
        int result = 0;
        while (result < MAX) {
            result += WEEKS;
            System.out.println(result);
        }
    }
}
