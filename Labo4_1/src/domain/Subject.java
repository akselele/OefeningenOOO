package domain;

import java.util.List;

public interface Subject {
    void registerObserver(List<EventType> list, Observer o);
    void removeObserver(EventType e, Observer o);
    void notifyObservers(EventType e,Account account);
    void addObserver(EventType e, Observer o);
}
