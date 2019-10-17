package domain;

public interface Subject {
    void registerObserver(Observer o, String eventType);
    void removeObserver(Observer o, String eventType);
    void notifyObservers(Account account);
}
