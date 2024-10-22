package smart_home_remote_control;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        remote.setCommand(0, new TurnTVOn(tv));
        remote.setCommand(1, new SetVolume(tv, 80));
        remote.setCommand(2, new DimLights(light, 50));

        remote.executeCommand();
        remote.undoCommand();
    }
}