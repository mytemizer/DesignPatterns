package structural_patterns.proxy_pattern;

public class Video {

    private final long id;
    private final String name;

    public Video(long id, String name) {

        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
