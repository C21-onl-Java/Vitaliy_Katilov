package ru.teachmeskills.homework04;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        int[] array = new int[] {3, 6, 7, 11, 54, 18};
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 0;
        for ( ; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("The number " + number + " is in the array.");
                break;
            }
        }
            if (i == array.length){
                System.out.println("The number " + number + " is not in the array.");
            }

    }
}
