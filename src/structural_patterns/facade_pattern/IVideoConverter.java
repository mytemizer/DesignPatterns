package structural_patterns.facade_pattern;

public interface IVideoConverter {
    VideoFile convert(String filename, String format);
}
