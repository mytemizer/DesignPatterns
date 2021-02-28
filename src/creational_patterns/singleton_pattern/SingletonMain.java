package creational_patterns.singleton_pattern;

public class SingletonMain {

    public static void runSingletonPattern() {
        SingletonMain singletonMain = new SingletonMain();
        singletonMain.doOperations();
    }

    public void doOperations() {
        doInsertion();
        doDeletion();
        System.out.println();

    }

    private void doDeletion() {
        getDatabase().doDeletion();
    }

    private void doInsertion() {
        getDatabase().doInsertion();
    }

    private Database getDatabase() {
        return Database.getInstance();
    }
}
