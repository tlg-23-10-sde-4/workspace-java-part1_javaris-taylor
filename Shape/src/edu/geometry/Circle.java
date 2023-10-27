package edu.geometry;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
       this.radius = radius;
    }

    public double area() {

       return Math.PI * (getRadius() * getRadius());
    }

    public double getRadius() {
        return radius;
    }

}