package weather_monitoring_system;

public class StatisticsDisplay implements WeatherDisplay {
    private double maxTemperature;
    private double minTemperature;
    private double averageTemperature;

    public void update(double temperature, double humidity, double pressure) {
        if (maxTemperature == 0 || temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (minTemperature == 0 || temperature < minTemperature) {
            minTemperature = temperature;
        }

        averageTemperature = (averageTemperature + temperature) / 2;

        display();
    }

    public void display() {
        System.out.println("Statistics: max temp = " + maxTemperature + " degrees, min temp = " + minTemperature + " degrees, avg temp = " + averageTemperature + " degrees");
    }
}