package creational_patterns.factory_pattern.logistic;

import creational_patterns.factory_pattern.model.Transport;

public abstract class Logistic {

    public abstract Transport createTransport();

    public void startDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
