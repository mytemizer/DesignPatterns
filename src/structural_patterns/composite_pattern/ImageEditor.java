package structural_patterns.composite_pattern;

public class ImageEditor {

    private CompoundGraphic compoundGraphic;

    public void load() {

        compoundGraphic = new CompoundGraphic();

        compoundGraphic.addChildren(new Dot(1,2));
        compoundGraphic.addChildren(new Dot(1,3));
        compoundGraphic.addChildren(new Circle(3,3, 5));
    }

    public void groupSelected(CompoundGraphic components) {
        CompoundGraphic tempGraphs = new CompoundGraphic();

        tempGraphs.addChildren(components);
        this.compoundGraphic.removeChildren(components);
        this.compoundGraphic.addChildren(tempGraphs);

        this.compoundGraphic.draw();
    }
}
