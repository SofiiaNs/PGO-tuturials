package com.company;

public class Circle implements Figure {
    double Radius;
    double Perimetr;
    double Surface;

        public Circle(double radius) {
        this.Radius = radius;
    }
        public double getPerimeter() {
        Perimetr = 10* Radius * 2 ;
        return Perimetr;
    }
    @Override

        public double getArea() {
        Surface = Radius * Radius * 2;
        return Surface;
    }
    @Override

        public String getType() {
        String Name = "circle";
        return Name ;
    }
}