package edu.geometry;

public class Rectangle implements Shape {

    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double area() {
        return getLength() * getWidth();
    }


    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }


}