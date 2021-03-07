package structural_patterns.proxy_pattern;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {


    @Override
    public HashMap<Long, Video> listVideos() {
        System.out.println("Api Request : List Videos");
        HashMap<Long, Video> videoHashMap = new HashMap<>();

        for (long i = 0; i < 2; i++) {
            videoHashMap.put(i, new Video(i, "i -> " + i));
        }

        return videoHashMap;
    }

    @Override
    public Video getVideoInfo(long id) {
        System.out.println("Api Request : Video Info by id " + id);
        return new Video(id, "i -> " + id);
    }

    @Override
    public void downloadVideo(long id) {
        System.out.println("Api Request : Download Video by id " + id);
    }
}
