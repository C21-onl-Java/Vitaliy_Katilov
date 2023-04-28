package ru.teachmeskills.homework07.figures;

public class MyFigures {
    public static void main(String[] args) {

        Circle circle = new Circle(70);
        System.out.println("Площадь круга: \t\t\t\t" + circle.Area());
        System.out.println("Периметр круга: \t\t\t" + circle.Perimeter());

        Triangle triangle = new Triangle(30, 40, 50);
        System.out.println("Площадь треугольника: \t\t" + triangle.Area());
        System.out.println("Периметр треугольника: \t\t" + triangle.Perimeter());

        Rectangle rectangle = new Rectangle(80, 40);
        System.out.println("Площадь прямоугольника: \t" + rectangle.Area());
        System.out.println("Периметр прямоугольника: \t" + rectangle.Perimeter());
        System.out.println();

        Figures[] figures = new Figures[5];
        figures[0] = new Circle(20);
        figures[1] = new Circle(30);
        figures[2] = new Rectangle(20,30);
        figures[3] = new Rectangle(15,25);
        figures[4] = new Triangle(25, 35, 40);

        float allPerimeter = 0f;
        for (int i = 0; i < 5; i++) {
            allPerimeter += figures[i].Perimeter();
        }
            System.out.println("Периметр всех фигур в массиве: " + allPerimeter);
    }
}
