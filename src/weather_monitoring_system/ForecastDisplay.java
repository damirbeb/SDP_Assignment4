package weather_monitoring_system;

public class ForecastDisplay implements WeatherDisplay {
    private double lastTemperature;
    private double currentTemperature;
    private String forecast;

    public void update(double temperature, double humidity, double pressure) {
        lastTemperature = currentTemperature;
        currentTemperature = temperature;

        if (currentTemperature > lastTemperature) {
            forecast = "Improving weather";
        } else if (currentTemperature < lastTemperature) {
            forecast = "Weather deteriorating";
        } else {
            forecast = "No change in weather";
        }

        display();
    }

    public void display() {
        System.out.println("Forecast: " + forecast);
    }
}