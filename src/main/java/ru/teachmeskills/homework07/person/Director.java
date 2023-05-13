package ru.teachmeskills.homework07.person;

public class Director implements Person{
    private final String name;
    private final String jobTitle;

    public Director(String name) {
        this.name = name;
        jobTitle = "директор.";
    }

    public void printPosition() {
        System.out.println(this.name + " - " + jobTitle);
    }
}
