package ru.teachmeskills.homework07.figures;
//круг S = π × r2
public class Circle extends Figures{
    private float r;

    public Circle(float r) {

        this.r = r;
    }
    @Override
    public float calculateArea() {
        return (float) Math.PI * (r * r);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * r);
    }
}
