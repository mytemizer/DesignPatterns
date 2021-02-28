package structural_patterns.flyweight_pattern;

public class Tree {
    private int x,y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(String canvas) {
        treeType.draw(canvas, x, y);
    }

    public TreeType getTreeType() {
        return treeType;
    }
}
