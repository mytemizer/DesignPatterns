package creational_patterns.builder_pattern;

import creational_patterns.builder_pattern.builders.CarBuilder;
import creational_patterns.builder_pattern.builders.CarManualBuilder;
import creational_patterns.builder_pattern.model.Car;
import creational_patterns.builder_pattern.model.Manual;

public class BuilderMain {

    private final Director director;
    private final CarManualBuilder manualBuilder;
    private final CarBuilder carBuilder;

    public BuilderMain() {
        this.director = new Director();
        this.manualBuilder = new CarManualBuilder();
        this.carBuilder = new CarBuilder();
    }

    public static void testBuilderPattern() {
        BuilderMain builderMain = new BuilderMain();
        builderMain.operate();
    }

    private void operate() {
        director.setBuilder(manualBuilder);
        createSUV();
        createBiggerSUV();

        director.setBuilder(carBuilder);
        createSportCar();
    }

    private void createBiggerSUV() {
        director.makeBiggerSUV();
        Manual manual = manualBuilder.getManual();
        manual.printConfiguration();
    }

    private void createSUV() {
        director.makeSUV();
        Manual manual = manualBuilder.getManual();
        manual.printConfiguration();
    }

    private void createSportCar() {
        director.makeSportCar();
        Car car = carBuilder.getCar();
        car.printConfiguration();
    }
}
