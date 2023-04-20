package ru.teachmeskills.homework04;

import java.util.Random;
import java.util.Scanner;

public class MaxMinAverage {
    public static void main(String[] args) {

        final int MAX_RANDOM = 100;
        System.out.print("Enter an integer for the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        Random random = new Random();

        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(MAX_RANDOM) + 1;
            System.out.print(array[i] + " ");
        }

        int min = array[0];
        int max = array[0];
        float average = 0.0f;

        for (int i = 0; i < number; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            average += array[i];
        }

        System.out.println();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average / array.length);
    }
}
