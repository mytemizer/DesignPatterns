package structural_patterns.composite_pattern;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{

    private ArrayList<Graphic> graphics = new ArrayList<>();

    public void addChildren(Graphic graphic) {
        graphics.add(graphic);
    }

    public void removeChildren(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic graphic : graphics) {
            graphic.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("Compound Draw Started!");
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}
