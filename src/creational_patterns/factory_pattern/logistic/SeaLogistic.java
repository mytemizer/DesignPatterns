package creational_patterns.factory_pattern.logistic;

import creational_patterns.factory_pattern.model.Ship;
import creational_patterns.factory_pattern.model.Transport;

public class SeaLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
