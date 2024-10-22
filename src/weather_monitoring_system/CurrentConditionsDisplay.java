package weather_monitoring_system;

public class CurrentConditionsDisplay implements WeatherDisplay {
    private double temperature;
    private double humidity;
    private double pressure;

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: temperature = " + temperature + " degrees, humidity = " + humidity + "%");
    }
}