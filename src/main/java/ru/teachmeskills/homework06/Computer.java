package ru.teachmeskills.homework06;

public class Computer {
    private int price;
    private String model;
    private final RAM ram;
    private final HDD hdd;
    static int ID = 0;

    public Computer() {
        ram = new RAM();
        hdd = new HDD();
        ID++;
    }
    public Computer(String model, int price) {
        this();
        this.model = model;
        this.price = price;
    }
    public Computer(String model, int price, RAM ram, HDD hdd) {
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
        ID++;
    }
    public void displayFields() {
        System.out.println("Computer " + ID + "\nModel: " + this.model + "\nPrice: " + this.price + "$" +
                "\nRAM\n" +    ram.toString() + "\nHDD\n" + hdd.toString());
        System.out.println();
    }
}
