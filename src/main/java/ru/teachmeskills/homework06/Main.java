package ru.teachmeskills.homework06;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Dell", 1200);

        computer1.displayFields();

        RAM ram = new RAM("Apacer", "4096 MB");
        HDD hdd = new HDD("Seagate", "500 GB", "Internal");
        Computer computer2 = new Computer("Samsung", 1500, ram, hdd);

        computer2.displayFields();

        Computer computer3 = new Computer("Lenovo", 1000,
                new RAM("Kingston", "8192 MB"),
                new HDD("Western Digital", "1000 GB", "External"));

        computer3.displayFields();
    }
}
