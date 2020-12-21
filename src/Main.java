import creational_patterns.abstract_factory_pattern.AbstractFactoryMain;
import creational_patterns.builder_pattern.BuilderMain;
import creational_patterns.factory_pattern.FactoryMain;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** FACTORY DESIGN PATTERN ***");
        FactoryMain.testFactoryPattern();

        System.out.println("*** ABSTRACT FACTORY DESIGN PATTERN ***");
        AbstractFactoryMain.testAbstractFactoryPattern();

        System.out.println("*** BUILDER DESIGN PATTERN ***");
        BuilderMain.testBuilderPattern();
    }
}
