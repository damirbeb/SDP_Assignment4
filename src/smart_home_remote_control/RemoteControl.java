package smart_home_remote_control;

public class RemoteControl {
    private Command[] commands;
    private int currentSlot;

    public RemoteControl() {
        commands = new Command[7];
        currentSlot = 0;
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void executeCommand() {
        commands[currentSlot].execute();
    }

    public void undoCommand() {
        commands[currentSlot].undo();
    }
}