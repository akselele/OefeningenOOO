package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank implements Subject{
    private Map<Integer,Account> accounts;
    private Map<EventType,List<Observer>> observers;
    private String name;


    public Bank(String name){
        this.name = name;
        this.accounts = new HashMap<>();
        this.observers = new HashMap<>();
    }


    public void openAccount(double balance){
        Account account = new Account(balance,accounts.size()+1);
        accounts.put(accounts.size()+1,account);
        notifyObservers(EventType.ADD,account);
    }

    public int totalNrOfAccounts(){
        return accounts.size();
    }

    @Override
    public void registerObserver(List<EventType> list,Observer observer) {
        for(EventType e: list){
            addObserver(e,observer);
        }
    }

    @Override
    public void removeObserver(EventType e, Observer o) {
            this.observers.get(e).remove(o);
    }

    @Override
    public void notifyObservers(EventType e, Account account) {
        if(account == null){
            throw new IllegalArgumentException();
        }
        for (Observer o : this.observers.get(e)){
            o.update(account, account.getAccountNumber(),account.getCreationDate());
        }
    }

    @Override
    public void addObserver(EventType e, Observer o) {
        this.observers.get(e).add(o);
    }

    public Account getAccount(int accountNumber){
        return this.accounts.get(accountNumber);
    }

    public Map<Integer, Account> getAccounts() {
        return accounts;
    }

    public void withdraw(Account account, double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Not a legal number");
        }
        int id = account.getAccountNumber();
        accounts.get(id).setAccountBalance(accounts.get(id).getAccountBalance() - amount);
        notifyObservers(EventType.WITHDRAW,account);
    }

    public void deposit(Account account, double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Not a legal number");
        }
        int id = account.getAccountNumber();
        accounts.get(id).setAccountBalance(accounts.get(id).getAccountBalance() + amount);
        notifyObservers(EventType.DEPOSIT,account);
    }


}
