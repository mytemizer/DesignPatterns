import creational_patterns.abstract_factory_pattern.AbstractFactoryMain;
import creational_patterns.builder_pattern.BuilderMain;
import creational_patterns.factory_pattern.FactoryMain;
import creational_patterns.protorype_pattern.PrototypeMain;

public class Main {
    public static void main(String[] args) {
        runCreationalPatterns();
    }

    private static void runCreationalPatterns() {

        System.out.println("*** FACTORY DESIGN PATTERN ***");
        FactoryMain.runFactoryPattern();

        System.out.println("*** ABSTRACT FACTORY DESIGN PATTERN ***");
        AbstractFactoryMain.runAbstractFactoryPattern();

        System.out.println("*** BUILDER DESIGN PATTERN ***");
        BuilderMain.runBuilderPattern();

        System.out.println("*** PROTOTYPE DESIGN PATTERN ***");
        PrototypeMain.runPrototypePattern();

    }
}
