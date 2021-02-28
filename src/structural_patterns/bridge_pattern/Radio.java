package structural_patterns.bridge_pattern;

public class Radio implements Device {
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
        System.out.println("Radio Enabled!");
    }

    @Override
    public void disable() {
        isEnabled = true;
        System.out.println("Radio Disabled!");

    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Radio volume is set to " + percent);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio channel is set to " + channel);
    }
}
