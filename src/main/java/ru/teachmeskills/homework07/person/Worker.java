package ru.teachmeskills.homework07.person;

public class Worker implements Person{
    private final String name;
    private final String jobTitle;

    public Worker(String name) {
        this.name = name;
        jobTitle = "рабочий.";
    }

    public void printPosition() {
        System.out.println(this.name + " - " + jobTitle);
    }
}
