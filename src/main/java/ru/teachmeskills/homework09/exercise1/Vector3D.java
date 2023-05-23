package ru.teachmeskills.homework09.exercise1;

public class Vector3D {

    private final static  String  DIMENSION_VECTOR_3D = "Вектор для трёхмерной системы координат.";

    private final double  X1;
    private final double  Y1;
    private final double  Z1;
    private double  X2;
    private double  Y2;
    private double  Z2;

    public Vector3D(double X1, double Y1, double Z1) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.Z1 = Z1;
    }
    public Vector3D(double X1, double Y1, double Z1, double X2, double Y2, double Z2) {
        this(X1, Y1, Z1);
        this.X2 = X2;
        this.Y2 = Y2;
        this.Z2 = Z2;
    }

    public static String getDimensionVector() {
        return DIMENSION_VECTOR_3D;
    }

    //Длинна вектора
    public double calculateLength() {
        return   Math.sqrt(Math.pow(X1, 2) +  Math.pow(Y1, 2)) + Math.pow(Z1, 2);
    }

    //Скалярное произведение векторов
    public double calculateScalarProduct() {
        return X1 * X2 + Y1 * Y2 + Z1 * Z2;
    }

    //Сложение векторов
    public String calculateSum() {
        double a = X1 + X2;
        double b = Y1 + Y2;
        double c = Z1 + Z2;
        return "{" + a + "; " + b +  "; " + c +"}";
    }

    //Разность векторов
    public String calculateDifference() {
        double a = X1 - X2;
        double b = Y1 - Y2;
        double c = Z1 - Z2;
        return "{" + a + "; " + b + "; " + c +"}";
    }

    //Сравнение векторов
    public String compareVectors() {
        return (X1 == X2  &&  Y1 == Y2 && Z1 == Z2) ? "равны." : "не равны.";
    }

    //Информация овекторе
    public String getInformationVector() {
        return DIMENSION_VECTOR_3D + "\nКоординаты вектора - (" + X1 + "; " + Y1 + "; " + Z1 + ")" +
                "\nДлинна вектора - " + calculateLength();
    }

}
