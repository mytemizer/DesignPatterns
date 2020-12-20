package creational_patterns.factory_pattern.model;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship starts delivering");
    }
}
