package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank implements Subject{
    private Map<String,Account> accounts;
    private Map<String, List<Observer>> observers;


    public Bank(){
        accounts = new HashMap<>();
        observers = new HashMap<>();
    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }
}
