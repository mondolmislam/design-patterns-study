package design.pattern.behavioral.observer;

/**
 *
 * @author maidul
 */
public class WeatherObserver implements Observer {

    private int presure;
    private int temperature;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int presure, int temperature, int humidity) {
        this.presure = presure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("Pressure: " + this.presure + " Temperature: " + this.temperature + " Humidity: " + this.humidity);
    }

}
