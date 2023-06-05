package ru.teachmeskills.homework08;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", 210, "89248261111");
        Phone phone2 = new Phone("Nokia", 230, "89166252222");
        Phone phone3 = new Phone("Xiaomi", 190, "89062013333");

        Phone[] phones = new Phone[3];
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;

        //Вывод на консоль значения переменных класса Phone
        for (Phone p: phones) {
            System.out.println("Модель телефона: " + p.getModel() + "\nВес телефона: " + p.getWeight() +
                    "\nНомер телефона: " + p.getNumber() + "\n");
        }

        String[] names = new String[3];
        names[0] = "Андрей";
        names[1] = "Сергей";
        names[2] = "Ирина";

        //Вызов метода receiveCall(String name) для каждого из объектов
        int i = 0;
        for (Phone p: phones) {
            p.receiveCall(names[i++]);
        }
        System.out.println();

        //Вызов метода getNumber() для каждого из объектов
        for (Phone p: phones) {
            System.out.println("Звонит " + p.getNumber());
        }
        System.out.println();

        String[] numbers = new String[3];
        numbers[0] = "89158264444";
        numbers[1] = "89128265555";
        numbers[2] = "89188246666";

        //Вызов перегруженного метода receiveCall(String name, String number)
        i = 0;
        for (Phone p: phones) {
            p.receiveCall(names[i], numbers[i++]);
        }
        System.out.println();

        //Вызов метода с аргументами переменной длинны
        System.out.println("Номера для отправки сообщений");
        Phone.sendMessage(numbers);

    }
}
