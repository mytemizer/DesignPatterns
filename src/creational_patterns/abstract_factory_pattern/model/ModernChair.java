package creational_patterns.abstract_factory_pattern.model;

public class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        System.out.println("Sat on Modern Chair!");
    }
}
