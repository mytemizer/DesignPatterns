package creational_patterns.abstract_factory_pattern;

import creational_patterns.abstract_factory_pattern.factories.AntiqueFurnitureFactory;
import creational_patterns.abstract_factory_pattern.factories.FurnitureFactory;
import creational_patterns.abstract_factory_pattern.factories.ModernFurnitureFactory;
import creational_patterns.abstract_factory_pattern.model.Chair;
import creational_patterns.abstract_factory_pattern.model.Sofa;

public class AbstractFactoryMain {

    private final FurnitureFactory factory;
    private Chair chair;
    private Sofa sofa;

    public AbstractFactoryMain(FurnitureStyle style) {
        factory = createFactory(style);
    }

    public static void runAbstractFactoryPattern() {
        operateFactory(FurnitureStyle.MODERN);
        operateFactory(FurnitureStyle.ANTIQUE);

        System.out.println();
    }

    private static void operateFactory(FurnitureStyle style) {
        AbstractFactoryMain abstractFactoryMain = new AbstractFactoryMain(style);
        abstractFactoryMain.createFurniture();
        abstractFactoryMain.useFurniture();
    }

    private FurnitureFactory createFactory(FurnitureStyle style) {
        switch (style) {
            case MODERN:
                return new ModernFurnitureFactory();
            case ANTIQUE:
                return new AntiqueFurnitureFactory();
            default:
                throw new IllegalStateException("Unexpected furniture style: " + style);
        }
    }

    private void createFurniture() {
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    private void useFurniture() {
        chair.sitOn();
        sofa.sitOn();
    }
}
