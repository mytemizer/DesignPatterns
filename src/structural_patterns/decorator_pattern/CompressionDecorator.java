package structural_patterns.decorator_pattern;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String readData() {
        System.out.println("Data is extracted!");
        return wrappee.readData();
    }

    @Override
    public void writeData(String data) {
        System.out.println("Data is compressed!");
        wrappee.writeData(data);
    }
}
