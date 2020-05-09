package design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maidul
 */
public class WeatherStation implements Subject{
    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observerList;

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObserver();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObserver();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObserver();
    }

    public WeatherStation() {
        this.observerList=new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer o: observerList){
            o.update(pressure, temperature, humidity);
        }
    }
    
    
}
