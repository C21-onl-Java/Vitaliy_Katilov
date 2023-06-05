package ru.teachmeskills.homework09.exercise1;


public class Main {
    public static void main(String[] args) {

        Vector2D vector2D = new Vector2D(3,5);

        System.out.println(Vector2D.getDimensionVector());
        System.out.println("\nДлинна вектора - " + vector2D.calculateLength());

        Vector2D twoVector2D  = new Vector2D(3.4,5,3.4,5);
        System.out.println("\nСкалярное произведение векторов:  " + twoVector2D.calculateScalarProduct());

        System.out.println("\nРезультат сложения векторов:  " + twoVector2D.calculateSum());

        System.out.println("\nРезультат вычитания векторов:  " + twoVector2D.calculateDifference());

        System.out.println("\nРезультат сравнения векторов:  " + twoVector2D.compareVectors());

        System.out.println("\nИнформация о векторе.\n" + vector2D.getInformationVector());
        System.out.println();



        Vector3D vector3D = new Vector3D(3, 5, 9);
        System.out.println(Vector3D.getDimensionVector());
        System.out.println("\nДлинна вектора: " + vector3D.calculateLength());

        Vector3D twoVector3D = new Vector3D(3,5, 9, 7, 6, 14);
        System.out.println("\nСкалярное произведение векторов:  " + twoVector3D.calculateScalarProduct());

        System.out.println("\nРезультат сложения векторов:  " + twoVector3D.calculateSum());

        System.out.println("\nРезультат вычитания векторов:  " + twoVector3D.calculateDifference());

        System.out.println("\nРезультат сравнения векторов:  " + twoVector3D.compareVectors());

        System.out.println("\nИнформация о векторе.\n" + vector3D.getInformationVector());
        System.out.println();
    }
}
