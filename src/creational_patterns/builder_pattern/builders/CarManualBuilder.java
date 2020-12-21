package creational_patterns.builder_pattern.builders;

import creational_patterns.builder_pattern.model.Manual;

public class CarManualBuilder implements Builder {
    Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeat(int number) {
        manual.setSeat(number);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        manual.setTripComputer("-");
    }

    @Override
    public void setGPS() {
        manual.setGPS("Manual GPS");
    }

    public Manual getManual() {
        Manual product = this.manual;
        reset();
        return product;
    }
}
