package ru.teachmeskills.homework03;

public class Fibonacci {
    public static void main(String[] args) {
        final int MAX_NUMB_CYCLES = 11;
        int x = 0;
        int y = 1; // y = -1;
        int i = 0;
        System.out.print("Fibonacci sequence: ");

        while (i++ < MAX_NUMB_CYCLES) {
            System.out.print(x + ", ");
            x += y;
            y = x - y;
        }
    }
}
