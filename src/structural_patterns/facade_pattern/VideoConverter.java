package structural_patterns.facade_pattern;

public class VideoConverter implements IVideoConverter{


    // A lot of messy stuff going on here!
    // Client doesn't need to know details. All client needs is conversion.
    @Override
    public VideoFile convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        CodecFactory codecFactory = new CodecFactory();
        Codec sourceCodec = codecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        BitrateReader bitreader = new BitrateReader();
        String buffer = bitreader.read(filename, sourceCodec);
        String result = bitreader.convert(buffer, destinationCodec);
        result = (new AudioMixer()).fix(result);

        System.out.println("Video is converted!");
        return new VideoFile(result);
    }
}
