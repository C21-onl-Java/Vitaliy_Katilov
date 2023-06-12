package ru.teachmeskills.homework11.exercise2;

public class Main {
    public static void main(String[] args) {
        boolean result = false;
        try {
            result = Authorization.setAuthorization("sdahfjkufljsdhsfgh", "ghgfd0123trywefgdgf", "ghgfd0123trywefgdgf");

        } catch (WrongLoginException loginException) {
            System.out.println(loginException.getMessage());
        } catch (WrongPasswordException passwordException) {
            System.out.println(passwordException.getMessage());
        }

        if (result)
            System.out.println("Авторизация выполнена успешно.");
        else
            System.out.println("Авторизация не выполнена.");
    }
}
