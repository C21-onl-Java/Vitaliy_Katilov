package ru.teachmeskills.homework03;

import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        final float PERCENT_OF_MONTH = 7;
        System.out.print("Enter deposit amount: ");
        Scanner scanner = new Scanner(System.in);
        float initDeposit = scanner.nextFloat();
        System.out.print("Enter number of months: ");
        int numberMonth = scanner.nextInt();
        float finalDeposit = initDeposit;

        for (int i = 0; i < numberMonth; i++) {
            finalDeposit += finalDeposit * (PERCENT_OF_MONTH / 100);
        }
        System.out.println("The final amount of the deposit for " + numberMonth + " months is " + finalDeposit);
    }
}
