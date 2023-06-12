package ru.teachmeskills.homework11.exercise2;

public class Authorization {

    static boolean setAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20)
            throw new WrongLoginException("Логин содержит более 20 символов. Попробуйте снова.");
        for (int i = 0; i < login.length(); i++) {
            if (login.charAt(i) == ' ')
                throw new WrongLoginException("Логин содержит пробелы. Попробуйте снова.");
        }
        System.out.println("Ваш логин: " + login);

        if (password.length() > 20)
            throw new WrongPasswordException("Введёный пароль содержит более 20 символов. Попробуйте снова.");

        boolean result = true;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == ' ')
                throw new WrongPasswordException("Введёный пароль содержит пробелы. Попробуйте снова.");
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                result = false;
            }
        }
        if (result)
            throw new WrongPasswordException("Введёный пароль не содержит ни одной цифры. Попробуйте снова.");

        if (!confirmPassword.equals(password))
            throw new WrongLoginException("Пароли не совпадают. Попробуйте снова.");

        System.out.println("Ваш пароль: " + password);
        return true;
    }

}
