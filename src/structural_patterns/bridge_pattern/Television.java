package structural_patterns.bridge_pattern;

public class Television implements Device {
    private boolean isEnabled = false;
    private int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        isEnabled = true;
        System.out.println("Television Enabled!");
    }

    @Override
    public void disable() {
        isEnabled = true;
        System.out.println("Television Disabled!");

    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Television volume is set to " + percent);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Television channel is set to " + channel);
    }
}
