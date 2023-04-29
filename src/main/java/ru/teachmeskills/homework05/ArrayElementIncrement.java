package ru.teachmeskills.homework05;

import java.util.Random;
import java.util.Scanner;
public class ArrayElementIncrement {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        int MAX_SIZE = 3;
        int[][][] arr = new int[MAX_SIZE][MAX_SIZE][MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                for (int k = 0; k < MAX_SIZE; k++) {
                    arr[i][j][k] = random.nextInt(10);
                    System.out.print(arr[i][j][k] + " ");
                    arr[i][j][k] += number;
                }
                System.out.println();
            }
            System.out.println();
        }

        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                for (int k = 0; k < MAX_SIZE; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

