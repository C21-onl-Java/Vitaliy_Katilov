package ru.teachmeskills.homework06;

public class CreditCard {
    private final String accountNumber;
    private int currentAccountBalance;

    public CreditCard (String accountNumber, int currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }
    public void addAmount(int money) {
        currentAccountBalance += money;
        System.out.println("Вы положили на счёт № " + this.accountNumber + " - " + money + "$");
    }
    public void  withdrawMoney(int money) {
        currentAccountBalance -= money;
        System.out.println("Вы сняли со счёта № " + this.accountNumber + " - " + money + "$");
    }
    public void currentStatusOfCards() {
        System.out.println("Текущее состояние счёта № " + this.accountNumber + " - " + this.currentAccountBalance + "$");
    }
}
