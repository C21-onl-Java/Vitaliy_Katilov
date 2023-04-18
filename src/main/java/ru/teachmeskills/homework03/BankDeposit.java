package ru.teachmeskills.homework03;

import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        final float PERCENT = 7f/100;
        System.out.print("Enter deposit amount: ");
        Scanner scanner = new Scanner(System.in);
        float initDeposit = scanner.nextFloat();
        System.out.print("Enter number of months: ");
        int numberMonth = scanner.nextInt();

        for (int i = 0; i < numberMonth; i++) {
            initDeposit += initDeposit * PERCENT;
        }
        System.out.println("The final amount of the deposit for " + numberMonth + " months is " + initDeposit);
    }
}
