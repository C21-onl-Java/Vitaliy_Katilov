package ru.teachmeskills.homework06;

public class MyBank {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard("11111234567890121111", 170000);
        CreditCard creditCard2 = new CreditCard("22221234567890122222" , 120000);
        CreditCard creditCard3 = new CreditCard("33331234567890123333", 425000);

        creditCard1.currentStatusOfCards();
        creditCard2.currentStatusOfCards();
        creditCard3.currentStatusOfCards();
        System.out.println();

        creditCard1.addAmount(130000);
        creditCard2.addAmount(180000);
        creditCard3.withdrawMoney(125000);

        System.out.println();
        creditCard1.currentStatusOfCards();
        creditCard2.currentStatusOfCards();
        creditCard3.currentStatusOfCards();
    }
}
