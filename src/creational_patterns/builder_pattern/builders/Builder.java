package creational_patterns.builder_pattern.builders;

public interface Builder {

    void reset();

    void setSeat(int number);

    void setEngine(String engine);

    void setTripComputer();

    void setGPS();
}
