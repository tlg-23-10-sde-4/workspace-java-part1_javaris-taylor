package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(12, 25);
        rec.Area();
        Triangle tri = new Triangle(5, 10);
        tri.Area();
        Circle cir = new Circle(5);
        cir.Area();
    }
}