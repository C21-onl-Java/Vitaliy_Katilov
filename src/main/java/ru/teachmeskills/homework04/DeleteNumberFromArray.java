package ru.teachmeskills.homework04;

import java.util.Scanner;

public class DeleteNumberFromArray {
    public static void main(String[] args) {

        int[] array = new int[] {3, 6, 7, 11, 7, 54, 7, 18, 7, 3};
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;

        System.out.print("Source array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.print(array[i] + " ");
                counter++;
            } else {
                System.out.print(array[i] + " ");
            }
        }

        int[] array2 = new int[array.length - counter];
        System.out.println();
        System.out.print("Final array: ");

        for (int i = 0, j = 0; i < array.length; i++) {
             if (array[i] != number) {
                array2[j] = array[i];
                System.out.print(array2[j] + " ");
                j++;
            }
        }

        System.out.println();
        if (counter == 0 || counter > 4) {
            System.out.println("Удалено " + counter + " вхождений числа " + number);
        } else if (counter == 1) {
            System.out.println("Удалено " + counter + " вхождение числа " + number);
        } else {
            System.out.println("Удалено " + counter + " вхождения числа " + number);
        }
    }
}

