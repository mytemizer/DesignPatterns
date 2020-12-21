package creational_patterns.builder_pattern;

import creational_patterns.builder_pattern.builders.Builder;

public class Director {

    private Builder manualBuilder;


    public void setBuilder(Builder manualBuilder) {
        this.manualBuilder = manualBuilder;
    }

    public void makeSportCar() {
        manualBuilder.reset();
        manualBuilder.setSeat(2);
        manualBuilder.setEngine("Sport Engine");
        setDefaults();
    }

    public void makeSUV() {
        manualBuilder.reset();
        manualBuilder.setSeat(5);
        manualBuilder.setEngine("SUV Engine");
        setDefaults();
    }

    public void makeBiggerSUV() {
        manualBuilder.reset();
        manualBuilder.setSeat(7);
        manualBuilder.setEngine("Bigger SUV Engine");
        setDefaults();
    }

    public void setDefaults() {
        manualBuilder.setTripComputer();
        manualBuilder.setGPS();
    }
}
