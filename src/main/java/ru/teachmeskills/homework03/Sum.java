package ru.teachmeskills.homework03;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter any positive integer: ");
        Scanner scanner = new Scanner(System.in);
        int  number  = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println("Sum of numbers: " + result);
    }
}
