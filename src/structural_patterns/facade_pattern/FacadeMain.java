package structural_patterns.facade_pattern;

public class FacadeMain {

    public static void runFacadePattern() {
        FacadeMain facadeMain = new FacadeMain();
        facadeMain.doOperations();
    }

    private void doOperations() {

        IVideoConverter videoConverter = new VideoConverter();

        VideoFile videoFile = videoConverter.convert("filename", ".mp4");
        videoFile.save();
    }
}
