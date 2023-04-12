package ru.teachmeskills.homework03;

import java.util.Scanner;

public class SeasonIfElse {
    public static void main(String[] args) {
        System.out.print("Enter month number: ");
        Scanner scanner = new Scanner(System.in);
        int  monthNumber = scanner.nextInt();
        System.out.print("Season: ");

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2 )
            System.out.println("Winter.");
        else if (monthNumber >= 3 && monthNumber <= 5)
            System.out.println("Spring.");
        else if (monthNumber >= 6 && monthNumber <= 8)
            System.out.println("Summer.");
        else if (monthNumber >= 9 && monthNumber <= 11)
            System.out.println("Autumn.");
        else
            System.out.println("Error. Invalid number entered.");
    }
}


