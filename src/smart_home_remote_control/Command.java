package smart_home_remote_control;

public interface Command {
    void execute();
    void undo();
}