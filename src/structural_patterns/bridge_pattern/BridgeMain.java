package structural_patterns.bridge_pattern;

public class BridgeMain {

    public static void runBridgePattern() {
        BridgeMain bridgeMain = new BridgeMain();
        bridgeMain.doOperations();
    }

    private void doOperations() {
        Television tv = new Television();
        Radio radio = new Radio();

        RemoteController remote1 = new RemoteController(tv);
        RemoteController remote2 = new RemoteController(radio);
        AdvanceRemoteController remote3 = new AdvanceRemoteController(tv);

        remote1.togglePower();
        remote2.togglePower();
        remote3.togglePower();

        remote3.mute();
        remote1.volumeUp();

        remote2.channelUp();
        remote2.volumeUp();

    }
}
