package edu.geometry;

public class Triangle implements Shape{

    double base;
    double height;

    public Triangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    public void Area() {
          double  area =  (1 / 2) * base * height;
        System.out.println("The area of the triangle is: " + area);
    }

    double getBase() {
        return base;
    }

    void setBase(double base) {
        this.base = base;
    }

    double getHeight() {
        return height;
    }
    void setHeight(double height) {
        this.height = height;
    }
}