package creational_patterns.factory_pattern.logistic;

import creational_patterns.factory_pattern.model.Transport;
import creational_patterns.factory_pattern.model.Truck;

public class RoadLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
