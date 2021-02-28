package structural_patterns.composite_pattern;

public class CompositeMain {


    public static void runCompositePattern() {
        CompositeMain bridgeMain = new CompositeMain();
        bridgeMain.doOperations();
    }

    private void doOperations() {
        ImageEditor imageEditor = new ImageEditor();

        imageEditor.load();

        CompoundGraphic compoundGraphic = new CompoundGraphic();

        compoundGraphic.addChildren(new Dot(3,2));
        compoundGraphic.addChildren(new Circle(1,1, 2));
        compoundGraphic.addChildren(new Dot(4,3));

        imageEditor.groupSelected(compoundGraphic);

        System.out.println();

    }
}
