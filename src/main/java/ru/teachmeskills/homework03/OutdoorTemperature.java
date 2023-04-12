package ru.teachmeskills.homework03;

import java.util.Scanner;

public class OutdoorTemperature {
    public static void main(String[] args) {
        System.out.print("Enter outdoor temperature: ");
        Scanner scanner = new Scanner(System.in);
        int  temperature  = scanner.nextInt();

        if (temperature > -5) {
            System.out.println("Warm.");
        }
        else if (temperature >= -20) {
            System.out.println("Fine1.");
        }
        else {
            System.out.println("Cold.");
        }
    }

}
