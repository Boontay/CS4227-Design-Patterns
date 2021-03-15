package design_patterns.observer.weather.station;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
