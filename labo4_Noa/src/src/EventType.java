package src;

import java.util.ArrayList;
import java.util.List;

public enum EventType
{
    REKENING(new ArrayList<>()),
    AFHALING(new ArrayList<>()),
    STORTING(new ArrayList<>());

    private List<Observer> observers;

    EventType(List<Observer> observers) {
        this.observers = observers;
    }
    public void addObserver(Observer o)
    {
        this.observers.add(o);
    }
    public List<Observer> getObservers()
    {
        return this.observers;
    }
}
