package com.shapes;

public class Circle extends Shape {

    private double radius;
    private String name;
    public Circle(double radius, String name) {
        super(radius * 2, radius * 2);
        this.radius = radius;
        this.name = name;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
