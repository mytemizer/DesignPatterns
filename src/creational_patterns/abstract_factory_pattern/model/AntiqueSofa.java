package creational_patterns.abstract_factory_pattern.model;

public class AntiqueSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sat on Antique Sofa!");
    }
}
