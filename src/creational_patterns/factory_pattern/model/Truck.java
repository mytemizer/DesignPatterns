package creational_patterns.factory_pattern.model;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck starts delivering");
    }
}
