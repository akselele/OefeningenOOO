package domain;

import java.time.LocalDate;

public class AccountLogger implements Observer {
    private Account account;
    private int totalAcc;

    public AccountLogger(){
        account = null;
        totalAcc = 0;
    }

    @Override
    public String update(Account a, int total, LocalDate date) {
        account = a;
        totalAcc = total;

       return display();
    }

    public String  display(){
        String out = "";
        out += "Nr: " + account.getAccountNumber() + "\nTotal of accounts: " + totalAcc;
        return out;
    }
}
