package ru.teachmeskills.homework04;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayString {
    public static void main(String[] args) {
        String[] name = new String[] {"Наталья", "Сергей", "Ольга", "Вероника", "Максим", "Артём"};
        System.out.print("Не отсортирован:");
        System.out.println(Arrays.toString(name));
        Arrays.sort(name, Comparator.naturalOrder());
        System.out.print("Отсортирован:   ");
        System.out.println(Arrays.toString(name));
    }
}
