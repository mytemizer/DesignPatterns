package structural_patterns.flyweight_pattern;

import java.util.HashMap;

public class TreeFactory {
    public static HashMap<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {

        String key = name + "_" + color + "_" + texture;
        TreeType treeType = treeTypes.get(key);

        if (treeType == null) {
            treeType = new TreeType(name, color, texture);
            treeTypes.put(key, treeType);
        } else {
            System.out.println("Same Tree Type Found!!!");
        }

        return treeType;
    }
}
