package structural_patterns.facade_pattern;

public class VideoFile {
    private String filename;

    public VideoFile(String filename) {

        this.filename = filename;
    }

    public void save() {
        System.out.println("Video is saved!");
    }
}

class OggCompressionCodec extends Codec {

}

class MPEG4CompressionCodec extends Codec {

}

class Codec {

}

class CodecFactory {

    public Codec extract(VideoFile file) {
        return new Codec();
    }

}

class BitrateReader {
    public String read(String filename, Codec sourceCodec) {
        return "buffer";
    }

    public String convert(String buffer, Codec destinationCodec) {
        return "result";
    }
}

class AudioMixer {

    public String fix(String result) {
        return result;
    }
}