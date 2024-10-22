package weather_monitoring_system;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.setMeasurements(80, 65, 30.4);
        weatherStation.setMeasurements(78, 70, 29.2);
        weatherStation.setMeasurements(76, 85, 28.1);
    }
}