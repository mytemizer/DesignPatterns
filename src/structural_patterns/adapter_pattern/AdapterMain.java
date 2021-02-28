package structural_patterns.adapter_pattern;


public class AdapterMain {

    public static void runAdapterPattern() {
        AdapterMain adapterMain = new AdapterMain();
        adapterMain.doOperations();
    }

    private void doOperations() {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println("Round Peg fits Round Hole -> " + hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        // Doesn't compile
        // hole.fits(smallSquarePeg);

        SquarePegAdapter smallSqrPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSqrPegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Small square peg fits Round Hole -> " + hole.fits(smallSqrPegAdapter));
        System.out.println("Large square peg fits Round Hole -> " + hole.fits(largeSqrPegAdapter));


    }

}
