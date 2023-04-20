package ru.teachmeskills.homework04;

import java.util.Arrays;
import java.util.Random;

public class TwoArrays {
    public static void main(String[] args) {
        final int MAX_SIZE = 5;
        int[] array1 = new int[MAX_SIZE];
        int[] array2 = new int[MAX_SIZE];
        Random random = new Random();

        float average1 = 0.0f;
        float average2 = 0.0f;
        for (int i = 0; i < MAX_SIZE; i++) {
            array1[i] = random.nextInt(10);
            average1 += array1[i];
            array2[i] = random.nextInt(10);
            average2 += array2[i];
        }
        average1 /= MAX_SIZE;
        average2 /= MAX_SIZE;
        System.out.println("Arrays1: " + Arrays.toString(array1));
        System.out.println("Arrays2: " + Arrays.toString(array2));

        if (average1 > average2) {
            System.out.println("Среднее арифмтическое массива array1 больше, чем array2");
        } else if (average1 < average2) {
            System.out.println("Среднее арифмтическое массива array1 меньше, чем array2");
        } else {
            System.out.println("Среднее арифмтическое массивов равны.");
        }
    }
}
