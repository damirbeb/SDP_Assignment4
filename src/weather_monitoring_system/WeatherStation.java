package weather_monitoring_system;

public class WeatherStation {
    private WeatherDisplay currentConditionsDisplay;
    private WeatherDisplay statisticsDisplay;
    private WeatherDisplay forecastDisplay;

    public WeatherStation() {
        currentConditionsDisplay = new CurrentConditionsDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}