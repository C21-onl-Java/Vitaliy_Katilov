package ru.teachmeskills.homework05;
//homework 5 exercise 3
//Умножение двух матриц
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixOne = new int[][] {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] matrixTwo = new int[][] {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int[][] matrixProduct = new int[matrixOne.length][matrixTwo[0].length];     //new array [3][3]

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                for (int k = 0; k < matrixTwo.length; k++) {
                    matrixProduct[i][j] += matrixOne[i][k] * matrixTwo[k][j];       //умножение матриц
                }
            }
        }
        for (int i = 0; i < matrixProduct.length; i++) {
            for (int j = 0; j < matrixProduct.length; j++) {
                System.out.print(matrixProduct[i][j]);              //вывод результата произведения матриц
            }
        }
    }
}
