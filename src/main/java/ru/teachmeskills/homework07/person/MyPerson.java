package ru.teachmeskills.homework07.person;

public class MyPerson {
    public static void main(String[] args) {

        Person director = new Director("Александр");
        director.printPosition();

        Person accountant = new Accountant("Наталья");
        accountant.printPosition();

        Person worker = new Worker("Сергей");
        worker.printPosition();
    }
}
