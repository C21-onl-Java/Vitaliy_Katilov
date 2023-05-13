package ru.teachmeskills.homework07.person;

public class Accountant implements Person{
    private final String name;
    private final String jobTitle;

    public Accountant(String name) {
        this.name = name;
        jobTitle = "бухгалтер.";
    }

    public void printPosition() {
        System.out.println(this.name + " - " + jobTitle);
    }
}
