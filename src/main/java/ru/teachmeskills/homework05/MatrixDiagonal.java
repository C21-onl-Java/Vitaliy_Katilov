package ru.teachmeskills.homework05;
//homework 5 exercise 5

import java.util.Random;
public class MatrixDiagonal {
    public static void main(String[] args) {

        Random random = new Random();
        int MAX_SIZE = 5;
        int[][] arr = new int[MAX_SIZE][MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0, j = 0; i < MAX_SIZE; i++, j++) {
            System.out.print(arr[i][j]);
        }
        System.out.println();
        for (int i = 0, j = MAX_SIZE - 1; i < MAX_SIZE; i++, j--) {
            System.out.print(arr[i][j]);
        }
    }
}
