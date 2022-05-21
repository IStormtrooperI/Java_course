package com.shapes;

import java.util.ArrayList;

public class ShapesManager {
    private static ShapesManager instance = new ShapesManager();
    private final ArrayList<Shape> shapes;

    public static ShapesManager getInstance() {
            return instance;
    }

    private ShapesManager() {
        this.shapes = new ArrayList<>();
    }


    public void registerShape(Shape shape) {
        shapes.add(shape);
    }

    public void displayShapes() {
        System.out.printf(" we have: %d Shapes:\n", shapes.size());
        for (Shape a : shapes) {
            System.out.println(a.getName());
        }
    }
}
