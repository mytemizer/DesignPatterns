package structural_patterns.flyweight_pattern;

import java.util.ArrayList;

public class FlyweightMain {

    public static void runFlyweightPattern() {
        FlyweightMain flyweightMain = new FlyweightMain();
        flyweightMain.doOperations();
    }

    private void doOperations() {

        Forest forest = new Forest();

        forest.plantTree(1, 2, "White Ash Tree", "Green", "a");

        forest.plantTree(3, 2, "White Ash Tree", "Brown", "a");

        forest.plantTree(2, 4, "Pine Tree", "Green", "b");

        forest.plantTree(5, 5, "Pine Tree", "Red", "b");

        forest.plantTree(3, 2, "White Ash Tree", "Green", "a");

        forest.draw();
    }

}
