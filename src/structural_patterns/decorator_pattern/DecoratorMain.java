package structural_patterns.decorator_pattern;

public class DecoratorMain {

    private boolean compressionEnabled = true;
    private boolean encryptionEnabled = true;

    public static void runDecoratorPattern() {
        DecoratorMain decoratorMain = new DecoratorMain();
        decoratorMain.doOperations();
    }

    private void doOperations() {
        DataSource fileDataSource = new FileDataSource("fileName.dat");

        fileDataSource = new DataSourceDecorator(fileDataSource);

        if (compressionEnabled) {
            fileDataSource = new CompressionDecorator(fileDataSource);
        }

        if (encryptionEnabled) {
            fileDataSource = new EncryptionDecorator(fileDataSource);
        }

        fileDataSource.writeData("data");
        System.out.println();
    }
}
