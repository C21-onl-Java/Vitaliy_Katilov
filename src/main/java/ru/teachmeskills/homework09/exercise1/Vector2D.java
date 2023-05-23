package ru.teachmeskills.homework09.exercise1;

public class Vector2D {

    private final static  String  DIMENSION_VECTOR_2D = "Вектор для двумерной системы координат.";

    private final double  X1;
    private final double  Y1;
    private double  X2;
    private double  Y2;


    public Vector2D(double X1, double Y1) {
        this.X1 = X1;
        this.Y1 = Y1;
    }
    public Vector2D(double X1, double Y1, double X2, double Y2) {
        this(X1, Y1);
        this.X2 = X2;
        this.Y2 = Y2;
    }

    public static String getDimensionVector() {
        return DIMENSION_VECTOR_2D;
    }


    //Длинна вектора
    public double calculateLength() {
        return   Math.sqrt(Math.pow(X1, 2) +  Math.pow(Y1, 2));
    }

    //Скалярное произведение векторов
    public double calculateScalarProduct() {
         return  X1 * X2 + Y1 * Y2;
    }

    //Сложение векторов
    public String calculateSum() {
        double a = X1 + X2;
        double b = Y1 + Y2;
        return "{" + a + "; " + b + "}";
    }

    //Разность векторов
    public String calculateDifference() {
        double a = X1 - X2;
        double b = Y1 - Y2;
        return "{" + a + "; " + b + "}";

    }

    //Сравнение векторов
    public String compareVectors() {
        return (X1 == X2  &&  Y1 == Y2) ? "равны." : "не равны.";
    }

    //Информация овекторе
    public String getInformationVector() {
        return DIMENSION_VECTOR_2D + "\nКоординаты вектора - (" + X1 + ";" + Y1 +")\n" +
                "Длинна вектора - " + calculateLength();
    }

}


