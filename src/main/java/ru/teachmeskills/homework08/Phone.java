package ru.teachmeskills.homework08;

public class Phone {
    private String model;
    private int weight;
    private String number;

    public Phone() {}

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, int weight, String number) {
        this(model, number);
        this.weight = weight;
    }

    public void receiveCall(String name) {

        System.out.println("Звонит " + name + " ");
    }
    public void receiveCall(String name, String number) {

        System.out.println("Звонит " + name + " " + number);
    }

    public static void sendMessage(String... num) {
        for (String n: num) {
            System.out.println(n);
        }
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String getNumber() {

        return number;
    }
}
