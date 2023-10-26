package edu.geometry;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        setRadius(radius);
    }
    public void Area() {
        double pie = 3.14;
        double area = pie * (radius * radius);
        System.out.println("The area of the circle is: " + area);
    }
   public double getRadius() {
        return radius;
    }
   public void setRadius(double radius) {
        this.radius = radius;
    }

}