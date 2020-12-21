package creational_patterns.builder_pattern.builders;

import creational_patterns.builder_pattern.model.Car;

public class CarBuilder implements Builder {
    Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeat(int number) {
        car.setSeat(number);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer("Trip Computer");
    }

    @Override
    public void setGPS() {
        car.setGPS("GPS");
    }

    public Car getCar() {
        Car product = this.car;
        reset();
        return product;
    }
}
