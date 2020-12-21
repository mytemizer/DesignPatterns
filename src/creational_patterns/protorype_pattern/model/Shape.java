package creational_patterns.protorype_pattern.model;

import java.awt.*;

public abstract class Shape {

    public int xValue;
    public int yValue;
    public Color color;


    public Shape() {
    }

    public Shape(Shape shape) {
        this();
        this.xValue = shape.xValue;
        this.yValue = shape.yValue;
        this.color = shape.color;
    }

    public abstract Shape clone();


    public abstract double calculateArea();
}
