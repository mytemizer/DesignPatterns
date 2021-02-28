package structural_patterns.decorator_pattern;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String readData() {
        System.out.println("Data is decrypted!");
        return wrappee.readData();
    }

    @Override
    public void writeData(String data) {
        System.out.println("Data is encrypted!");
        wrappee.writeData(data);
    }

}
