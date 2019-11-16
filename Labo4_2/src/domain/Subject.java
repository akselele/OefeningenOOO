package domain;

public interface Subject {
    void registerObserver(EventType e, Observer o);
    void removeObserver(EventType e, Observer o);
    void notifyObserver(EventType e, String s);
}
