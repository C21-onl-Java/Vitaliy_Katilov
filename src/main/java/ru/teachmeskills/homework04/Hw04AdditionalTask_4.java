package ru.teachmeskills.homework04;

import java.util.Random;
import java.util.Scanner;

public class Hw04AdditionalTask_4 {
    public static void main(String[] args) {
        final int MAX_RANDOM = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 6 до 10 включительно, чтобы определить размер массива: ");
        int size = scanner.nextInt();
        while(size < 6 || size > 10) {
                System.out.println("Введённое значение не удовлетворяет условию. Вы ввели " + size);
                System.out.println("Введите число от 6 до 10 включительно: ");
                size = scanner.nextInt();
        }

        int[] array = new int[size];
        Random random = new Random();
        int counter = 0;
        System.out.print("First array: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(MAX_RANDOM);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                counter++;
            }
        }

        System.out.println();
        int[] array2 = new int[counter];
        System.out.print("Second array: ");

        for (int i = 0, j = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                array2[j] = array[i];
                System.out.print(array2[j] + " ");
                j++;
            }
        }
    }
}
