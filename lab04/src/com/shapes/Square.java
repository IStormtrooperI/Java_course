package com.shapes;

public class Square extends Shape {

    private double side;

    public Square(double side, String name) {
        super(name, side, side);
        this.side = side;
        ShapesManager.getInstance().registerShape(this);
    }

    public double area() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
}
