package creational_patterns.builder_pattern.model;

public class Car {
    private int seatNumber;
    private String engine;
    private String tripComputer;
    private String gps;

    public void setSeat(int number) {

        this.seatNumber = number;
    }

    public void setEngine(String engine) {

        this.engine = engine;
    }

    public void setTripComputer(String tripComputer) {

        this.tripComputer = tripComputer;
    }

    public void setGPS(String gps) {

        this.gps = gps;
    }

    public void printConfiguration() {
        System.out.println(
                "CAR : " + "\n" +
                        "seatNumber : " + seatNumber + "\n" +
                        "engine : " + engine + "\n" +
                        "tripComputer : " + tripComputer + "\n" +
                        "gps : " + gps + "\n"
        );
    }
}
