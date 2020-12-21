package creational_patterns.protorype_pattern.model;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Shape clone() {
        Rectangle rectangle = new Rectangle(this);
        System.out.println("Rectangle cloned!");
        return rectangle;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
