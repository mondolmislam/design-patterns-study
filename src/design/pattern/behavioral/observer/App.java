package design.pattern.behavioral.observer;

/**
 *
 * @author maidul
 * 
 * Defines a one to many dependency -> if one object change state all of its dependents are notified automatically
 * 
 * The observers rely/dependent on the subjects
 * 
 * Why is it good? LOOSE COUPLING?
 *  --> when two objects are loosely coupled, they can interact but they have little knowledge of each other
 *  --> the only thing the subject knows about an observer is that it implements a certain interface
 *  --> We can add observers whenever we want: just have to implement the observer interface
 *  --> we do not have to modify the subject to add new type of observers
 *  --> we can change the subject or observer independently
 * 
 * So loosely coupled design is very good: we can build flexible systems that can handle change because the interdependency between objects are minimal
 * 
 * Very important principle in design --> USE LOOSELY COUPLED DESIGN BETWEEN OBJECTS TAHT INTERACTS
 */
public class App {
    public static void main(String[] args) {
        WeatherStation station=new WeatherStation();
        WeatherObserver observer=new WeatherObserver(station);
        station.setHumidity(100);
        station.setPressure(23);
        station.setTemperature(40);
    }
}
