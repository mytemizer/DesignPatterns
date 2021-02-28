import creational_patterns.abstract_factory_pattern.AbstractFactoryMain;
import creational_patterns.builder_pattern.BuilderMain;
import creational_patterns.factory_pattern.FactoryMain;
import creational_patterns.protorype_pattern.PrototypeMain;
import creational_patterns.singleton_pattern.SingletonMain;
import structural_patterns.adapter_pattern.AdapterMain;
import structural_patterns.bridge_pattern.BridgeMain;
import structural_patterns.composite_pattern.CompositeMain;
import structural_patterns.decorator_pattern.DecoratorMain;
import structural_patterns.facade_pattern.FacadeMain;

public class Main {
    public static void main(String[] args) {
        runCreationalPatterns();

        runStructuralPatterns();
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

        System.out.println("*** SINGLETON DESIGN PATTERN ***");
        SingletonMain.runSingletonPattern();

    }

    private static void runStructuralPatterns() {
        System.out.println("*** ADAPTER DESIGN PATTERN ***");
        AdapterMain.runAdapterPattern();

        System.out.println("*** BRIDGE DESIGN PATTERN ***");
        BridgeMain.runBridgePattern();

        System.out.println("*** COMPOSITE DESIGN PATTERN ***");
        CompositeMain.runCompositePattern();

        System.out.println("*** DECORATOR DESIGN PATTERN ***");
        DecoratorMain.runDecoratorPattern();

        System.out.println("*** FACADE DESIGN PATTERN ***");
        FacadeMain.runFacadePattern();

    }
}
