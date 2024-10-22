package smart_home_remote_control;

public class Light {
    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light turned off");
    }

    public void dim(int level) {
        System.out.println("Light dimmed to " + level + "%");
    }

    public void setBrightness(int level) {
        System.out.println("Light brightness set to " + level + "%");
    }
}