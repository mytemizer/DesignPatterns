package structural_patterns.proxy_pattern;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    HashMap<Long, Video> listVideos();

    Video getVideoInfo(long id);

    void downloadVideo(long id);
}
