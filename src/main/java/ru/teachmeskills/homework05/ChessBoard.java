package ru.teachmeskills.homework05;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] whiteBlack = new String[8][8];
        for (int i = 0; i < whiteBlack.length; i++) {
            for (int j = 0; j < whiteBlack[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(whiteBlack[i][j] = "W" + " ");
                } else {
                    System.out.print(whiteBlack[i][j] = "B" + " ");
                }
            }
            System.out.println();
        }
    }
}
