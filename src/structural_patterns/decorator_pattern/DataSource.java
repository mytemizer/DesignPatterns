package structural_patterns.decorator_pattern;

public interface DataSource {

    String readData();

    void writeData(String data);
}
