package structural_patterns.decorator_pattern;

public class DecoratorMain {

    public static void runDecoratorPattern() {
        DecoratorMain decoratorMain = new DecoratorMain();
        decoratorMain.doOperations();
    }

    private void doOperations() {
        FileDataSource fileDataSource = new FileDataSource("fileName.dat");
        fileDataSource.writeData("data");
        System.out.println();

        DataSourceDecorator dataSourceDecorator = new DataSourceDecorator(fileDataSource);
        dataSourceDecorator.writeData("data");
        System.out.println();

        CompressionDecorator compressionDecorator = new CompressionDecorator(dataSourceDecorator);
        compressionDecorator.writeData("data");
        System.out.println();

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(compressionDecorator);
        encryptionDecorator.writeData("data");
        System.out.println();


        encryptionDecorator.readData();
        System.out.println();
    }
}
