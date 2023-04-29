package ru.teachmeskills.homework05;
//homework 5 exercise 6
//Сортировка массива по строкам

import java.util.Random;
import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {

        Random random = new Random();
        int MAX_SIZE = 3;
        int[][] arr = new int[MAX_SIZE][MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                arr[i][j] = random.nextInt(10);     //array initialization
                System.out.print(arr[i][j] + " ");          //Outputting an unsorted array
            }
            Arrays.sort(arr[i]);                           //sort array by rows
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");          //sorted array output
            }
            System.out.println();
        }
    }
}
