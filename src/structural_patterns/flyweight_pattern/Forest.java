package structural_patterns.flyweight_pattern;

import java.util.ArrayList;

public class Forest {

    private ArrayList<Tree> treeList = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        treeList.add(tree);
    }

    public void draw() {
        for (Tree tree : treeList) {
            tree.draw("canvas");
        }
    }
}
