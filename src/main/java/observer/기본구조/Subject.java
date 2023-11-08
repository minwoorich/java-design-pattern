package observer.기본구조;

import java.util.List;

public class Subject {
    private final List<Observer> observers;

    public Subject(List<Observer> observers) {
        this.observers = observers;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
