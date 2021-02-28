package structural_patterns.decorator_pattern;

public class DataSourceDecorator implements DataSource {

    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {

        this.wrappee = source;
    }

    @Override
    public String readData() {
        System.out.println("DataSourceDecorator -> Read OP");
        return wrappee.readData();
    }

    @Override
    public void writeData(String data) {
        System.out.println("DataSourceDecorator -> Write OP");
        wrappee.writeData(data);
    }
}
