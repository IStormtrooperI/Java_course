package com;

import com.shapes.Circle;
import com.shapes.Square;

public class Main {

    public static void main(String[] args) {
        Circle newCircle = new Circle(5,"newCircle");
        System.out.println("area of circle with name: " + " " + newCircle.getName() + " " + newCircle.area());
        Square newSquare = new Square(5,"newSquare");
        System.out.println("area of square with name: " + " " + newSquare.getName() + " " + newSquare.area());
    }
}
