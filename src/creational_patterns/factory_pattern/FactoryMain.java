package creational_patterns.factory_pattern;

import creational_patterns.factory_pattern.logistic.Logistic;
import creational_patterns.factory_pattern.logistic.RoadLogistic;
import creational_patterns.factory_pattern.logistic.SeaLogistic;
import creational_patterns.factory_pattern.model.Transport;

public class FactoryMain {

    public static void runFactoryPattern() {
        FactoryMain factoryMain = new FactoryMain();
        Transport transport;

        transport = factoryMain.createTransport(TransportType.TRUCK);
        transport.deliver();

        transport = factoryMain.createTransport(TransportType.SHIP);
        transport.deliver();

        System.out.println();

    }

    public Transport createTransport(TransportType type) {
        Logistic logistic = getLogistic(type);
        logistic.planDelivery();
        return logistic.createTransport();
    }

    private Logistic getLogistic(TransportType type) {
        switch (type) {
            case SHIP:
                return new SeaLogistic();
            case TRUCK:
                return new RoadLogistic();
            default:
                throw new IllegalStateException("Unexpected Transport Type: " + type);
        }
    }

}
