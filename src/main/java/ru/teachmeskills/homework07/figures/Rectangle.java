package ru.teachmeskills.homework07.figures;
// прямоугольник S = a × b
public class Rectangle extends Figures{

   private float length;
   private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public float calculateArea() {
        return this.length * this.width;
    }

    @Override
    public float calculatePerimeter() {
        return this.length * 2 + this.width * 2;
    }
}
