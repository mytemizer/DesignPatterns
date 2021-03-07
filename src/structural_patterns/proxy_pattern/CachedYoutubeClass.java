package structural_patterns.proxy_pattern;

import java.util.HashMap;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeClass youtubeService;
    private HashMap<Long, Video> listCache;
    private HashMap<Long, Video> downloadedVideoCahce;
    private HashMap<Long, Video> videoInfoCache;
    private boolean needReset = false;
    private boolean isVideoDownloaded = true;

    public CachedYoutubeClass(ThirdPartyYoutubeClass youtubeService) {
        this.youtubeService = youtubeService;
    }


    @Override
    public HashMap<Long, Video> listVideos() {
        if (listCache == null || needReset) {
            listCache = youtubeService.listVideos();
        } else {
            System.out.println("No need to fetch list again!");
        }
        return listCache;
    }

    @Override
    public Video getVideoInfo(long id) {
        if (videoInfoCache == null) {
            videoInfoCache = new HashMap<>();
            videoInfoCache.put(id, youtubeService.getVideoInfo(id));
        } else if (!isVideoInfoFetched(id) || needReset) {
            videoInfoCache.put(id, youtubeService.getVideoInfo(id));
        } else {
            System.out.println("No need to fetch video info again! id -> " + id);
        }
        return videoInfoCache.get(id);
    }

    @Override
    public void downloadVideo(long id) {
        if (downloadedVideoCahce == null) {
            downloadedVideoCahce = new HashMap<>();
            youtubeService.downloadVideo(id);
            downloadedVideoCahce.put(id, new Video(id, "id -> " + id));
        } else if (!isVideoDownloaded(id) || needReset) {
            youtubeService.downloadVideo(id);
            downloadedVideoCahce.put(id, new Video(id, "id -> " + id));
        } else {
            System.out.println("No need to download again! id -> " + id);
        }
    }

    private boolean isVideoInfoFetched(long id) {
        return videoInfoCache.containsKey(id);
    }

    private boolean isVideoDownloaded(long id) {
        return downloadedVideoCahce.containsKey(id);
    }

}
