package domain;

import java.time.LocalDate;

public class Auditor implements Observer {
    Account account;
    LocalDate date;


    public Auditor(){
        account = null;
        date = null;
    }


    @Override
    public String update(Account a, int total,LocalDate dateOpened) {
        account = a;
        date = dateOpened;
       return display();
    }

    public String display(){
        String out = "";
        out += "Account opened on " + date + "\nAccount number: " + account.getAccountNumber() + " Balance: " + account.getAccountBalance();
        return out;
    }
}
