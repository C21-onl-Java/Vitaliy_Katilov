package ru.teachmeskills.homework04;

import java.util.Random;

public class OddToZero {
    public static void main(String[] args) {
        final int MAX_RANDOM = 10;
        final int SIZE_MAX = 10;

        int[] array = new int[SIZE_MAX];
        Random random = new Random();
        int counter = 0;

        System.out.print("Source array:   ");
        for (int i = 0; i < SIZE_MAX; i++) {
            array[i] = random.nextInt(MAX_RANDOM);
            System.out.print(array[i] + " ");
            if (array[i] % 2 != 0) {
                array[i] = 0;
                counter++;
            }
        }
        System.out.println();
        System.out.print("Change to zero: ");
        for (int i = 0; i < SIZE_MAX; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nВсего заменено элементов: " + counter);
    }
}
