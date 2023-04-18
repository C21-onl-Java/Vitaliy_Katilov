package ru.teachmeskills.homework03;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        System.out.print("Enter month number: ");
        Scanner scanner = new Scanner(System.in);
        int  monthNumber = scanner.nextInt();
        System.out.print("Season: ");
        switch (monthNumber){
            case 12, 1, 2:
                System.out.println("Winter.");
                break;
            case 3, 4, 5:
                System.out.println("Spring.");
                break;
            case 6, 7, 8:
                System.out.println("Summer.");
                break;
            case 9, 10, 11:
                System.out.println("Autumn.");
                break;
            default:
                System.out.println("Error. Invalid number entered.");
        }
    }
}
