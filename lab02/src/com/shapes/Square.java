package com.shapes;

public class Square extends Shape {

    private double side;
    private String name;

    public Square(double side, String name) {
        super(side, side);
        this.side = side;
        this.name = name;
    }

    public double area() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
