package creational_patterns.abstract_factory_pattern.model;

public class AntiqueChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Sat on Antique Chair!");
    }
}
