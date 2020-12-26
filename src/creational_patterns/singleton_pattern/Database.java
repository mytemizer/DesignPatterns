package creational_patterns.singleton_pattern;

public class Database {

    private static Database instance;

    // Must be private constructor in order to not to violate singleton
    private Database() {
    }

    public synchronized static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void doInsertion() {
        System.out.println("Insertion is done by instance: " + instance);
    }

    public void doDeletion() {
        System.out.println("Deletion is done by instance: " + instance);
    }
}
