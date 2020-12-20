package creational_patterns.abstract_factory_pattern.factories;

import creational_patterns.abstract_factory_pattern.model.AntiqueChair;
import creational_patterns.abstract_factory_pattern.model.AntiqueSofa;
import creational_patterns.abstract_factory_pattern.model.Chair;
import creational_patterns.abstract_factory_pattern.model.Sofa;

public class AntiqueFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new AntiqueChair();
    }

    @Override
    public Sofa createSofa() {
        return new AntiqueSofa();
    }
}
