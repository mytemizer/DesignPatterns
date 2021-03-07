package structural_patterns.proxy_pattern;

import java.util.HashMap;

public class YoutubeManager {
    private ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public Video renderVideoPage(long id) {
        return service.getVideoInfo(id);
    }

    public HashMap<Long, Video> renderListPanel() {
        return service.listVideos();
    }

    public void downloadVideo(long id) {
        service.downloadVideo(id);
    }

    public void reactOnUserInput() {
        HashMap<Long, Video> longVideoHashMap = renderListPanel();
        // Second attempt, expect to get from cache
        longVideoHashMap = renderListPanel();

        System.out.println();

        longVideoHashMap.values().forEach(video -> {
            renderVideoPage(video.getId());
            // Second attempt, expect to get from cache
            renderVideoPage(video.getId());

            downloadVideo(video.getId());
            // Second attempt, expect to get from cache
            downloadVideo(video.getId());

            System.out.println();
        });
    }
}
