package structural_patterns.flyweight_pattern;

import java.util.ArrayList;

public class TreeFactory {
    public static ArrayList<TreeType> treeTypes = new ArrayList<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType treeType = null;
        for (TreeType tempTreetype:
             treeTypes) {
            if (tempTreetype.getName().equals(name) &&
                    tempTreetype.getColor().equals(color) &&
                    tempTreetype.getTexture().equals(texture)) {
                treeType = tempTreetype;
                System.out.println("Same Tree Type Found!!!");
            }
        }

        if (treeType == null) {
            treeType = new TreeType(name, color, texture);
        }

        treeTypes.add(treeType);
        return treeType;
    }
}
