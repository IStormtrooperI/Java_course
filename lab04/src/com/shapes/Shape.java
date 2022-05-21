package com.shapes;

public class Shape {

    protected double width;
    protected double height;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
}
