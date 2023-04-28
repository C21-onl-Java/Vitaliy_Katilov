package ru.teachmeskills.homework07.figures;
// треугольник S=0,5⋅a⋅h
public class Triangle extends Figures{

    private float a;       //Длинна, сторона a
    private float b;       //Длинна, сторона b
    private float c;        //Длинна, сторона с.

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public float Area() {
        float p = (a + b + c) / 2f;        //полупериметр треугольника
        return (float)  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public float Perimeter() {
        return a + b + c;
    }
}
