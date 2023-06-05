package ru.teachmeskills.homework10.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CheckForPalindrome check = new CheckForPalindrome("Заказ был доставлен в кабак вовремя");

        System.out.println("Найдите слово в предложении, являющееся палиндромом.");
        System.out.println("Введите число от 1 до " + check.getWords().length + ". Для выхода введите 0.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number < 0 || number > check.getWords().length) {

            System.out.println("Неправильно введено число.");
            System.out.println("Введите число от 1 до " + check.getWords().length + ". Для выхода введите 0.");
            number = scanner.nextInt();
        }

        if (number != 0) {
            System.out.println("В предложении: " + check.getString() + ".");
            check.getCheckForPalindrome(number);
            System.out.println();
        }
        System.out.println("Программа завершена.");
    }

}
