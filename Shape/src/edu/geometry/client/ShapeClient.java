package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Triangle;

class ShapeClient {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(12, 25);
        System.out.println(rec.area());
        Triangle tri = new Triangle(10, 10, 45);
        System.out.println(tri.area());
        Circle cir = new Circle(5);
        System.out.println(cir.area());
    }
}