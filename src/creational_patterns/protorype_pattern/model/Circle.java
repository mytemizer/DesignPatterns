package creational_patterns.protorype_pattern.model;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        Circle circle = new Circle(this);
        System.out.println("Circle cloned!");
        return circle;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
