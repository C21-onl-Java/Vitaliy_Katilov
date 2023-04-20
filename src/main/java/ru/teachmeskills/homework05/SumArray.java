package ru.teachmeskills.homework05;

import java.util.Random;
public class SumArray {
    public static void main(String[] args) {

        Random random = new Random();
        int MAX_SIZE = 3;
        int[][] arr = new int[MAX_SIZE][MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(3);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
