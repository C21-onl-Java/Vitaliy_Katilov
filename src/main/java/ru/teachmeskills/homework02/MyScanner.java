package ru.teachmeskills.homework02;

import java.util.Scanner;
public class MyScanner {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name: " + name);
    }
}
