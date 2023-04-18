package ru.teachmeskills.homework03;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        System.out.print("Enter a number from 1 to 7 to determine the color of the rainbow: ");
        Scanner scanner = new Scanner(System.in);
        int  number  = scanner.nextInt();
        if (number >= 1 && number <= 7)
            System.out.print("The entered number corresponds to the color of the rainbow: ");

        String color = "";
        switch (number) {
            case 1:
                color = "Red.";
                break;
            case 2:
                color = "Orange.";
                break;
            case 3:
                color = "Yellow.";
                break;
            case 4:
                color = "Green.";
                break;
            case 5:
                color = "Indigo.";
                break;
            case 6:
                color = "Blue.";
                break;
            case 7:
                color = "Violet.";
                break;
            default:
                color = "No such color.";
        }
        System.out.println(color);
    }
}
