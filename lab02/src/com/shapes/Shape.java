package com.shapes;

public class Shape {

    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
}
