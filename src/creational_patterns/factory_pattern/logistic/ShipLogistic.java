package creational_patterns.factory_pattern.logistic;

import creational_patterns.factory_pattern.model.Ship;
import creational_patterns.factory_pattern.model.Transport;

public class ShipLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
