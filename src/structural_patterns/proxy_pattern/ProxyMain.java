package structural_patterns.proxy_pattern;

public class ProxyMain {

    public static void runProxyPattern() {
        ProxyMain proxyMain = new ProxyMain();
        proxyMain.doOperations();
    }

    private void doOperations() {
        ThirdPartyYoutubeClass aYouTubeService = new ThirdPartyYoutubeClass();
        CachedYoutubeClass cachedYoutubeClass = new CachedYoutubeClass(aYouTubeService);
        YoutubeManager manager = new YoutubeManager(cachedYoutubeClass);
        manager.reactOnUserInput();
    }
}
