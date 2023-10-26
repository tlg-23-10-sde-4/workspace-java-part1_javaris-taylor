package edu.geometry;

public class Rectangle implements Shape {

    double length;
    double width;
    public void Area() {
        double area = length * width;
        System.out.println("The area of the Rectangle is: " + area);
    }
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    double getLength() {
        return length;
    }
    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

}