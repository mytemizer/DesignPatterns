package structural_patterns.decorator_pattern;

public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {

        this.fileName = fileName;
    }

    @Override
    public String readData() {
        System.out.println("Data is read!");
        return "data";
    }

    @Override
    public void writeData(String data) {
        System.out.println("Data is written to the file!");
    }
}
