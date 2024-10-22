package smart_home_remote_control;

public class DimLights implements Command {
    private Light light;
    private int level;

    public DimLights(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    public void execute() {
        light.dim(level);
    }

    public void undo() {
        light.setBrightness(level);
    }
}