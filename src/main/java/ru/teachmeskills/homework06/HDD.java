package ru.teachmeskills.homework06;

public class HDD {
    private final String name;
    private final String volume;
    private final String type;

    public HDD(){
        this.name = "Нет данных";
        this.volume = "Нет данных";
        this.type = "Нет данных";
    }
    public HDD(String name, String volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + "\nVolume: " + this.volume + "\nType: " + type;
    }
}
