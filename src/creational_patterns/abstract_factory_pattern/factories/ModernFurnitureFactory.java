package creational_patterns.abstract_factory_pattern.factories;

import creational_patterns.abstract_factory_pattern.model.Chair;
import creational_patterns.abstract_factory_pattern.model.ModernChair;
import creational_patterns.abstract_factory_pattern.model.ModernSofa;
import creational_patterns.abstract_factory_pattern.model.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
