package design.pattern.behavioral.observer;

/**
 *
 * @author maidul
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObserver();
}
