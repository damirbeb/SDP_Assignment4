package smart_home_remote_control;

public class TurnTVOn implements Command {
    private TV tv;

    public TurnTVOn(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }

    public void undo() {
        tv.turnOff();
    }
}