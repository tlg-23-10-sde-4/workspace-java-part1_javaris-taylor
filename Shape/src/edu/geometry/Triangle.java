package edu.geometry;

public class Triangle implements Shape{

    double angle;
    double side1;
    double side2;

    public Triangle(double side1, double side2, double angle) {
        this.angle = angle;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double area() {
          return  (getSide1() * getSide2() * Math.sin(getAngle())) * .5;
    }

    double getAngle() {
        return angle;
    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }


}