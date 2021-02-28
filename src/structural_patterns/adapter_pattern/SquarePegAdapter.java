package structural_patterns.adapter_pattern;

public class SquarePegAdapter extends RoundPeg {

    private static final double DEFAULT_RADIUS = 0;
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(DEFAULT_RADIUS);

        this.squarePeg = squarePeg;

    }


    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
