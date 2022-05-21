package com.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String name) {
        super(name, radius * 2, radius * 2);
        this.radius = radius;
        ShapesManager.getInstance().registerShape(this);
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
