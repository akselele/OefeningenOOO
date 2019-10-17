package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank implements Subject{
    private Map<String,Account> accounts;
    //private Map<String, List<Observer>> observers;
    private List<Observer> observers;


    public Bank(){
        accounts = new HashMap<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o, String eventType) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o, String eventType) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Account account) {
        for(Observer o : observers){
            o.update(account,totalNrOfAccounts());
        }
    }

    public void openAccount(Account a){
        accounts.put(a.getAccountNumber(),a);
        notifyObservers(a);
    }

    public int totalNrOfAccounts(){
        return accounts.size();
    }

}
