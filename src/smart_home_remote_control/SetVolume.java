package smart_home_remote_control;

public class SetVolume implements Command {
    private TV tv;
    private int volume;

    public SetVolume(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    public void execute() {
        tv.setVolume(volume);
    }

    public void undo() {
        tv.setVolume(volume);
    }
}