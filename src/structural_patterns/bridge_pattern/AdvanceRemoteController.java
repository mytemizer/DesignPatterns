package structural_patterns.bridge_pattern;

public class AdvanceRemoteController extends RemoteController {

    public AdvanceRemoteController(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device Muted!!");
    }
}
