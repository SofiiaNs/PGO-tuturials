package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


            Cat Marti = new Cat("Marti");
            Marti.start();
            System.out.println(Marti.getType() + " - " + Marti.getName());
            Marti.stop();


            Manager manager = new Manager("Lera", "Cydak", 1999, "shewa", 2015, 15000, 2000);
            System.out.println(manager);



            double radius = 2d;
            Figure Circle = new Circle(radius);

            double baseSide = 16d;
            double side = 8d;
            double height = 5d;
            Figure Parallelogram = new Parallelogram(baseSide, side, height);

            double SideA = 20d;
            double SideB = 10;

            Figure Rectangle = new Rectangle(SideA, SideB);
            List<Figure> figures = new ArrayList<>(3);
            figures.add(Circle);
            figures.add(Parallelogram);
            figures.add(Rectangle);

            for (Figure figure : figures) {
                System.out.println(figure.getType());
                System.out.println("Area: " + figure.getArea() + " units.");
                System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");



            }
    }
}


