package creational_patterns.factory_pattern;

import creational_patterns.factory_pattern.logistic.Logistic;
import creational_patterns.factory_pattern.logistic.RoadLogistic;
import creational_patterns.factory_pattern.logistic.ShipLogistic;

public class FactoryMain {

    public static void testFactoryPattern() {
        FactoryMain factoryMain = new FactoryMain();
        Logistic logistic;

        logistic = factoryMain.getLogistic(TransportType.TRUCK);
        logistic.startDelivery();

        logistic = factoryMain.getLogistic(TransportType.SHIP);
        logistic.startDelivery();

        System.out.println();

    }

    private Logistic getLogistic(TransportType type) {
        switch (type) {
            case SHIP:
                return new ShipLogistic();
            case TRUCK:
                return new RoadLogistic();
            default:
                throw new IllegalStateException("Unexpected Transport Type: " + type);
        }
    }

}
