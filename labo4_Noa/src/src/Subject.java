package src;

public interface Subject
{
    void registerObserver(Observer o, EventType type);
    void removeObserver(Observer o, EventType type);
    void notifyObserver(Rekening rekening, EventType type);
}
