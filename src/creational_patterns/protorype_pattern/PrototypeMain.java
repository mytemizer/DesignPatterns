package creational_patterns.protorype_pattern;

import creational_patterns.protorype_pattern.model.Circle;
import creational_patterns.protorype_pattern.model.Rectangle;
import creational_patterns.protorype_pattern.model.Shape;

import java.awt.*;
import java.util.ArrayList;

public class PrototypeMain {

    private final ArrayList<Shape> shapeList;

    public PrototypeMain() {
        this.shapeList = new ArrayList<>();
    }

    public static void runPrototypePattern() {
        PrototypeMain prototypeMain = new PrototypeMain();
        prototypeMain.produceShapes();

        ArrayList<Shape> copyList = new ArrayList<>();

        ArrayList<Shape> shapeList = prototypeMain.shapeList;
        for (int i = 0; i < shapeList.size(); i++) {

            copyList.add(shapeList.get(i).clone());
            printArea("Shape", i + shapeList.size(), copyList.get(i).calculateArea());
        }
    }

    private static void printArea(String type, int id, double area) {
        System.out.println("Area " + type + " " + id + ": " + String.format("%.2f", area) + "\n");
    }

    private void produceShapes() {
        Circle circle = new Circle();
        circle.radius = 20;
        circle.color = Color.GRAY;
        printArea("Circle", 0, circle.calculateArea());
        shapeList.add(circle);

        Shape anotherCircle = circle.clone();
        printArea("Circle", 1, anotherCircle.calculateArea());
        shapeList.add(anotherCircle);

        circle.radius = 15;

        Shape anotherCircle2 = circle.clone();
        printArea("Circle", 2, anotherCircle2.calculateArea());
        shapeList.add(anotherCircle2);

        Rectangle rectangle = new Rectangle();
        rectangle.height = 6;
        rectangle.width = 8;
        printArea("Rectangle", 3, rectangle.calculateArea());
        shapeList.add(rectangle);


    }
}
