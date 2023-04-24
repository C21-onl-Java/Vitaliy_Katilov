package ru.teachmeskills.homework06;

public class RAM {
    private final String name;
    private final String volume;

    public RAM(){
        this.name = "Нет данных";
        this.volume = "Нет данных";
    }
    public RAM(String name, String volume) {
        this.name = name;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return  "Name: " + this.name + "\nVolume: " + this.volume;
    }
}
